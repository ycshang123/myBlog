package top.ycshang.myblog.service.impl;

import top.ycshang.myblog.entity.Blog;
import top.ycshang.myblog.mapper.BlogMapper;
import top.ycshang.myblog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
