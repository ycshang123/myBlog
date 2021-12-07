package top.ycshang.myblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @program: myblog
 * @description: JwtToken
 * @author: ycshang
 * @create: 2021-12-07 15:35
 **/
public class JwtToken implements AuthenticationToken {

    private final String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}