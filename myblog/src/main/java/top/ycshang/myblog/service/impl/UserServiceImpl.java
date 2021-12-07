package top.ycshang.myblog.service.impl;

import top.ycshang.myblog.entity.User;
import top.ycshang.myblog.mapper.UserMapper;
import top.ycshang.myblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ycshang
 * @since 2021-12-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
