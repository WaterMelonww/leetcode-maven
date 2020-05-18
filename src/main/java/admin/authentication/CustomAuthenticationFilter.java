package admin.authentication;


import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 *
 * 用来解析前端发来的json数据格式username password
 * @author wangru
 * @create 2019-11-09 14:10
 */
@Component
public class CustomAuthenticationFilter  extends UsernamePasswordAuthenticationFilter {


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        System.out.println("进入请求体拦截");
        System.out.println(request.getContentType().toLowerCase().equals(MediaType.APPLICATION_JSON_UTF8_VALUE.toLowerCase()));
        if (request.getContentType().toLowerCase().equals(MediaType.APPLICATION_JSON_UTF8_VALUE.toLowerCase())||  request.getContentType().equals(MediaType.APPLICATION_JSON_VALUE)) {
            ObjectMapper mapper=new ObjectMapper();
            UsernamePasswordAuthenticationToken authRequest=null;
            try (InputStream is=request.getInputStream()){
                Map<String,String> authenticationBean = mapper.readValue(is,Map.class);
                authRequest=new UsernamePasswordAuthenticationToken(authenticationBean.get("username"),authenticationBean.get("password"));
                System.out.println("ssss==========>"+authRequest);
                setDetails(request,authRequest);
                return  this.getAuthenticationManager().authenticate(authRequest);
            } catch (IOException e) {
                e.printStackTrace();
                authRequest = new UsernamePasswordAuthenticationToken("", "");
                setDetails(request,authRequest);
                System.out.println("error==========>"+authRequest);
                return  this.getAuthenticationManager().authenticate(authRequest);
            }
        }else {
            return super.attemptAuthentication(request,response);
        }
    }

}
