package admin.service;

import com.ttt6.adminbackapi.admin.entity.Admin;
import com.ttt6.adminbase.remote.AdminRemoteService;
import com.ttt6.adminbase.utils.passwordUtils;
import com.ttt6.adminbase.vo.AdminVO;
import com.ttt6.adminbase.vo.SystemVO;
import com.ucarinc.framework.dubbo.config.annotation.UReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现加载用户信息的方法，得到当前登录用户的用户信息（用户名、密码、用户角色等）
 * UserDetailsService是Spring Security进行身份验证的时候会使用
 * @author wangru
 * @create 2019-11-09 10:02
 */

@Slf4j
@Service
public class AdminDetailsServiceImpl implements UserDetailsService {

    /**
     * 当获取远程数据时候会调用该远程接口
     */
    @UReference
    AdminRemoteService adminRemoteService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //先通过用户名去数据库查找用户信息
        AdminVO adminVO =  adminRemoteService.findByName(s);
        if(adminVO == null){
            throw new UsernameNotFoundException(String.format("'%s'.这个用户不存在", s));
        }
        List<SystemVO> roleByAdminId = adminRemoteService.findRoleByAdminId(adminVO.getId());
        List<SimpleGrantedAuthority> collect=new ArrayList<>();
        if(!roleByAdminId.isEmpty()){
            for(SystemVO temp:roleByAdminId){
                SimpleGrantedAuthority simpleGrantedAuthority=new SimpleGrantedAuthority("ROLE_"+temp.getCode());
                System.out.println(simpleGrantedAuthority);
                collect.add(simpleGrantedAuthority);
            }
        }
        String salt = adminVO.getSalt();
        Key tokey = passwordUtils.tokey(salt.getBytes());
        String password = passwordUtils.decryption(adminVO.getPassword(), tokey);
        //查询数据库中用户名和密码以及权限
        return new Admin(adminVO.getName(),new BCryptPasswordEncoder().encode(password),adminVO.getStatus(),collect);
    }
}
