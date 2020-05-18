package admin.controller;

import com.ttt6.adminbase.remote.AdminRemoteService;
import com.ttt6.common.common.Result;
import com.ucarinc.framework.dubbo.config.annotation.UReference;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangru
 * @create 2019-11-14 14:44
 */
@RestController
@CrossOrigin
public class LoginController {

    @UReference
    AdminRemoteService adminRemoteService;

    /**
     * 获取用户可以操作的所有权限按钮
     */
    @GetMapping("/getAllCode")
    public Result getAllCode(){
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            List<String> permissionList=adminRemoteService.getAllCode(authentication.getName());
            System.out.println(permissionList);
            return Result.success(permissionList);
        }catch (Exception e){
            return Result.error("获取操作按钮失败");
        }

    }

    /**
     * 没有登陆时，访问该路径
     */
    @RequestMapping("/loginInfo")
    public Result loginInfo(){
        return Result.error("请先登陆");
    }

    /**
     * 注销登录成功后返回消息 删除前端本地token
     * @return
     */
    @RequestMapping("/logoutSuccess")
    public Result logoutSuccess(){
        return Result.success("退出成功！");
    }

    /**
     * 获取所有用户可以操作的侧边栏
     */
    @GetMapping("/getSystemList")
    public Result getSystemList(){
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            System.out.println(authentication.getAuthorities());
            return Result.success(authentication.getAuthorities());
        }catch (Exception e){
            return Result.error("获取操作栏失败");
        }

    }

}
