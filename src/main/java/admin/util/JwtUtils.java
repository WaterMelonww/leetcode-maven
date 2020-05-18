package admin.util;

import com.alibaba.fastjson.JSONObject;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;
import java.util.HashMap;

/**
 * 生成和解析token的工具类
 * @author wangru
 * @create 2019-11-09 10:02
 */
public class JwtUtils {

    private static Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    private static HashMap<String,Authentication> hashMap = new HashMap<>();

    /**
     *  生成JWT token
     * @param authentication Spring Security认证后的信息
     * @return 生成的token
     */
    public static String generateToken(Authentication authentication){
        hashMap.put("authentication",authentication);
        String token = Jwts.builder()
                //设置token的信息
                //将认证后的authentication写入token，验证时，直接验证它
                .claim("authentication",authentication)
                //设置主题
                .setSubject(authentication.getName())
                //过期时间
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 24 * 1000))
                //加密方式及秘钥
                .signWith(SignatureAlgorithm.HS512, "MyJWTtest")
                .compact();
        return token;
    }

    /**
     *  解析 token
     * @param token 前端传来的token
     */
    public static void tokenParser(String token){
        Authentication authentication1 = hashMap.get("authentication");
        System.out.println(authentication1);
        if(authentication1==null){
            throw new  BadCredentialsException("token错误");
        }
        // 解析token.

            Claims claims = Jwts.parser()
                    .setSigningKey("MyJWTtest")
                    .parseClaimsJws(token)
                    .getBody();
            //获取过期时间
            Date claimsExpiration = claims.getExpiration();
            logger.info("过期时间"+claimsExpiration);
            //判断是否过期
            Date now = new Date();
            if (now.getTime() > claimsExpiration.getTime()) {
                throw new AuthenticationServiceException("凭证已过期，请重新登录！");
            }
            //获取保存在token中的登录认证成功的authentication，
            // 利用UsernamePasswordAuthenticationToken生成新的authentication
            // 放入到SecurityContextHolder，表示认证通过
            Object tokenInfo = claims.get("authentication");
            String subject = claims.getSubject();

            //通过com.alibaba.fastjson将其在转换。
            JwtAuthentication toknAuthentication = JSONObject.parseObject(JSONObject.toJSONString(tokenInfo), JwtAuthentication.class);
            toknAuthentication.setName(subject);
            SecurityContextHolder.getContext().setAuthentication(toknAuthentication);

    }
}
