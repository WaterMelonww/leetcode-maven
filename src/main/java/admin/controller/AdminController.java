package admin.controller;

import com.ttt6.adminbackapi.admin.ao.*;
import com.ttt6.adminbase.remote.AdminRemoteService;
import com.ttt6.adminbase.vo.AdminInfoVO;
import com.ttt6.adminbase.vo.PermissionVO;
import com.ttt6.adminbase.vo.SystemPermissionVO;
import com.ttt6.adminbase.vo.SystemVO;
import com.ttt6.common.common.Result;
import com.ucarinc.framework.dubbo.config.annotation.UReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

    @UReference
    AdminRemoteService adminRemoteService;

    /**
     * 获取所有管理员信息
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @GetMapping("/listAdmin")
    public Result listAdmin(){
        List<AdminInfoVO> allAdmin = adminRemoteService.getAllAdmin();
        return Result.success(allAdmin);
    }

    /**
     * 根据修改管理员状态
     * @return  com.ttt6.common.common.Result 封装的结果集
     */

    @PostMapping("/updateAdminStatus")
    public Result updateAdminStatus(@RequestBody UpdateAdminStatusAO updateAdminStatusAO){
        try {
            adminRemoteService.updateAdminStatus(updateAdminStatusAO.getAdminId(),updateAdminStatusAO.getStatus());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    /**
     * 根据用户名查找用户（搜索框）
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/findByName")
    public Result findByName(@RequestBody AddAdminAO addAdminAO){
        try {
            List<AdminInfoVO> byNameLike = adminRemoteService.findAdminNameByParam(addAdminAO.getName());
            return Result.success(byNameLike);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    /**
     * 查询用户是否重名（添加时的失焦事件）
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/isExistedAdminName")
    public Result addSearchName(@RequestBody AddAdminAO adminAO){

        Boolean existedAdminName = adminRemoteService.isExistedAdminName(adminAO.getName());
        if(existedAdminName) {
            return Result.error("该用户已存在");
        }
        return Result.success();
    }

    /**
     * 添加用户
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/addAdmin")
    public Result addAdmin(@RequestBody AddAdminAO addAdminAO){
        try {
            adminRemoteService.addAdmin(addAdminAO.getName(), addAdminAO.getPhone());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }
    }
    /**
     * 修改用户信息
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/updateAdminInfo")
    public Result updateAdminInfo(@RequestBody UpdateAdminInfoAO updateAdminInfoAO){
        try {
            adminRemoteService.updateAdminInfo(updateAdminInfoAO.getAdminId(), updateAdminInfoAO.getName(), updateAdminInfoAO.getPhone(), updateAdminInfoAO.getPassword());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    /**
     * 获取所有的操作系统和权限将其映射成一棵树
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @GetMapping("/listSystemPermission")
    public Result listSystemPermission(){
        List<SystemPermissionVO> allSystem = adminRemoteService.listSystemPermission();
        return Result.success(allSystem);
    }

    /**
     * 查看用户可操作的系统
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/viewAdminUseSystem")
    public Result viewAdminUseSystem(@RequestBody UpdateAdminInfoAO adminInfoAO){
        try {
            List<PermissionVO> permissionVOS = adminRemoteService.viewAdminUseSystem(adminInfoAO.getAdminId());
            return Result.success(permissionVOS);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }

    }
    /**
     * 根据系统名称查找系统
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/isExistedSystemName")
    public Result isExistedSystemName(@RequestBody SystemAO systemAO){
        Boolean existedSystemName = adminRemoteService.isExistedSystemName(systemAO.getName());
        if(existedSystemName) {
            return Result.error("该系统名已存在");
        }
        return Result.success();
    }
    /**
     * 根据系统标识查找系统
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/isExistedSystemCode")
    public Result isExistedSystemCode(@RequestBody SystemAO systemAO){
        Boolean existedSystemCode = adminRemoteService.isExistedSystemCode(systemAO.getCode());
        if(existedSystemCode) {
            return Result.error("该系统标识已存在");
        }
        return Result.success();
    }

    /**
     * 添加系统
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/addSystem")
    public Result addSystem(@RequestBody SystemAO systemAO){
        try {
            adminRemoteService.addSystem(systemAO.getName(),systemAO.getCode());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    /**
     * 遍历系统
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @GetMapping("/listSystem")
    public Result listSystem(){
        List<SystemVO> allSystem= adminRemoteService.getAllSystem();
        return Result.success(allSystem);
    }
    /**
     * 添加子菜单
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/addMenu")
    public Result addMenu(@RequestBody PermissionAO permissionAO){
        try {
            adminRemoteService.addMenu(permissionAO.getName(),permissionAO.getUrl(),permissionAO.getCode(),permissionAO.getSystemId());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    /**
     * 删除系统
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/deleteSystem")
    public Result deleteSystem(@RequestBody DeleteSystemAO deleteSystemAO){
        try {
            adminRemoteService.deleteSystem(deleteSystemAO.getSystemId());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    /**
     * 删除子菜单
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/deleteMenu")
    public Result deleteMenu(@RequestBody DeleteSystemAO deleteSystemAO){
        try {
            adminRemoteService.deleteMenu(deleteSystemAO.getPermissionId());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }
    }
    /**
     * 修改系统
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/updateSystem")
    public Result updateSystem(@RequestBody SystemAO systemAO){
        try {
            adminRemoteService.updateSystem(systemAO.getSystemId(),systemAO.getCode(),systemAO.getName());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    /**
     * 修改子菜单
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/updatePermission")
    public Result updatePermission(@RequestBody PermissionAO permissionAO){
        try {
            System.out.println(permissionAO);
            adminRemoteService.updatePermission(permissionAO.getPermissionId(),permissionAO.getUrl(),permissionAO.getCode(),permissionAO.getName(),permissionAO.getSystemId());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Result.error("修改失败");
        }
    }

    /**
     * 修改用户可操作的系统权限
     * @return com.ttt6.common.common.Result 封装的结果集
     */
    @PostMapping("/updateAdminUseSystem")
    public Result updateAdminUseSystem(@RequestBody  SystemPermissonAO systemPermissonAO){
        try {
            adminRemoteService.updateAdminUseSystem(systemPermissonAO.getAdminId(),systemPermissonAO.getSystemPermissionList());
            return Result.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return  Result.error(e.getMessage());
        }
    }




}
