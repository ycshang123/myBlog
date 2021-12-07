package top.ycshang.myblog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: myblog
 * @description:
 * @author: ycshang
 * @create: 2021-12-07 15:35
 **/
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}