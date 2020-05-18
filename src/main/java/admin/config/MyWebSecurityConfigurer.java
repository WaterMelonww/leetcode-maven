package admin.config;

import com.ttt6.adminbackapi.admin.authentication.CustomAuthenticationFilter;
import com.ttt6.adminbackapi.admin.authentication.JwtAuthenticationTokenFilter;
import com.ttt6.adminbackapi.admin.util.MyAccessDeniedHandler;
import com.ttt6.adminbackapi.admin.util.MyLoginFailucreHandler;
import com.ttt6.adminbackapi.admin.util.MyLoginSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * 配置拦截
 * @author wangru
 * @create 2019-11-09 10:39
 */
@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MyWebSecurityConfigurer extends WebSecurityConfigurerAdapter {


    @Qualifier("adminDetailsServiceImpl")
    @Autowired
    private UserDetailsService userDetailsService;

    //登陆成功的处理器

    @Autowired
    private MyLoginFailucreHandler myLoginFailureHandler;

    //登陆失败的处理器

    @Autowired
    private MyLoginSuccessHandler myLoginSuccessHandler;

    // 权限认证异常处理器

   @Autowired
   private MyAccessDeniedHandler myAccessDeniedHandler;


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        //passwoldEncoder是对密码的加密处理，如果user中密码没有加密，则可以不加此方法。注意加密请使用security自带的加密方式。
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        /** 将JWT拦截器添加到获取用户信息拦截器之前*/
        JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter=new JwtAuthenticationTokenFilter();
        http.addFilterBefore(jwtAuthenticationTokenFilter,CustomAuthenticationFilter.class);
        /** 配置默认登陆路径和登陆成功登陆失败以及登陆无权限时的处理器*/
        http.formLogin()
                //没有登陆时的访问登录路径
                .loginPage("/loginInfo")
                //用户登陆的路径
                .loginProcessingUrl("/login")
                .successHandler(myLoginSuccessHandler)
                .failureHandler(myLoginFailureHandler)
                .and()
                // AccessDeniedHandler处理器 拒绝访问处理器
                .exceptionHandling().accessDeniedHandler(myAccessDeniedHandler);
        http.csrf().disable().cors().and()//禁用了 csrf 功能
                .authorizeRequests()//限定签名成功的请求
                .anyRequest().access("@rbacService.hasPermission(request,authentication)")
                //permitAll允许所有角色（角色！！！即用户不用登陆也可以访问）进行访问
                .antMatchers("/login","/loginInfo","/logoutSuccess").permitAll();

        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.logout().logoutSuccessUrl("/logoutSuccess");
        //添加解析用户名和密码的拦截器 即实现@requestbody
        http.addFilterAt(customAuthenticationFilter(),UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    CustomAuthenticationFilter customAuthenticationFilter() throws Exception {
        CustomAuthenticationFilter filter = new CustomAuthenticationFilter();
        filter.setAuthenticationSuccessHandler(myLoginSuccessHandler);
        filter.setAuthenticationFailureHandler(myLoginFailureHandler);
        filter.setAuthenticationManager(authenticationManagerBean());
        return filter;
    }
}
