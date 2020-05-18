package admin.entity;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * 用来承接与后台数据库查询的数据比对
 * @author wangru
 * @create 2019-11-09 9:18
 */
@Data
public class Admin implements UserDetails ,Serializable {
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 用户权限
     */
    private Collection<? extends GrantedAuthority> authorities;


    public Admin(String username, String password, Integer status, Collection<? extends GrantedAuthority> authorities){
        this.username=username;
        this.password=password;
        this.status=status;
        this.authorities=authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }
    /**
     * 用户是否过期
     */
    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 用户是否被锁定
     */
    @Override
    public boolean isAccountNonLocked() {
        if(status==0){
            return true;
        }
        return false;
    }
    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}
