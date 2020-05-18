package admin.service;

import com.ttt6.adminbackapi.admin.entity.Urls;
import com.ttt6.adminbase.remote.AdminRemoteService;
import com.ucarinc.framework.dubbo.config.annotation.UReference;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.List;

/**
 * 判断用户是否可以访问该路径
 * @author wangru
 * @create 2019-11-16 15:07
 */

@Component("rbacService")
public class RbacServiceImpl implements  RbacService,Serializable {

    /**
     * 调用远端服务
     */
    @UReference
    AdminRemoteService adminRemoteService;

    /**
     * 匹配路径
     */
    private AntPathMatcher antPathMatcher = new AntPathMatcher();



    /**
     *
     * @param request 请求头
     * @param authentication spring security 注入的用户身份
     * @return 是否可以访问该路径
     */
    @Override
    public Boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Boolean hasPerission=false;
        String username = authentication.getName();
        System.out.println(request.getRequestURI());
        List<String> urlByAdminName = adminRemoteService.findUrlByAdminName(username);
        if(Urls.getAllCode.getUrl().equals(request.getRequestURI())){
            return true;
        }
        if (Urls.getSystemList.getUrl().equals(request.getRequestURI())){
            return true;
        }
        if (Urls.logoutSuccess.getUrl().equals(request.getRequestURI())){
            return true;
        }
        if (Urls.loginInfo.getUrl().equals(request.getRequestURI())){
            return true;
        }
        if(!urlByAdminName.isEmpty()){
            for (String urls:urlByAdminName){
                if(urls.equals(request.getRequestURI())){
                    hasPerission=true;
                    break;
                }
            }
        }
        return hasPerission;
    }
}
