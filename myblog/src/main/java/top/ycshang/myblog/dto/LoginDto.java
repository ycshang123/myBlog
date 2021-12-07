package top.ycshang.myblog.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @program: myblog
 * @description:
 * @author: ycshang
 * @create: 2021-12-07 18:11
 **/
@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}