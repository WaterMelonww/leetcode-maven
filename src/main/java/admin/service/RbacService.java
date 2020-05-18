package admin.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wangru
 * @create 2019-11-16 15:07
 */

public interface RbacService {
    /**
     * 判断该用户是否有权限
     * @param request 请求
     * @param authentication 认证体
     * @return 是否拥有该权限
     */
    Boolean hasPermission(HttpServletRequest request, Authentication authentication);
}
