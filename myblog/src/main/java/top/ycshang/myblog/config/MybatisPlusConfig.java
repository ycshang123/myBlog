package top.ycshang.myblog.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: myblog
 * @description:
 * @author: ycshang
 * @create: 2021-12-07 14:14
 **/
@Configuration
@EnableTransactionManagement
@MapperScan("top.ycshang.myblog.mapper")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}