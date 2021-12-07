package top.ycshang.myblog.util;

import org.apache.shiro.SecurityUtils;
import top.ycshang.myblog.shiro.AccountProfile;

/**
 * @program: myblog
 * @description: ShiroUtil工具类
 * @author: ycshang
 * @create: 2021-12-07 15:34
 **/
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}