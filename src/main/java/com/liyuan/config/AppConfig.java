package com.liyuan.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.util.List;

@ComponentScan(value = {"com.liyuan"}, includeFilters =
        {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})},
        useDefaultFilters = false)
@Configuration
@Import(RootConfig.class)
//@EnableWebMvc
//@EnableLoadTimeWeaving
public class
AppConfig implements WebMvcConfigurer {
    /**
     * 设置静态资源访问路径
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("/public", "classpath:/static/")
                .setCachePeriod(31556926);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter());
    }

    @Bean(destroyMethod = "", initMethod = "")
    @Description("这是一个数据源，于application.properties中配置好了")
    public DataSource dataSource(@Value("${liyuan.mysql.url}") String url,
                                 @Value("${liyuan.mysql.username}") String username,
                                 @Value("${liyuan.mysql.password}") String password,
                                 @Value("${liyuan.mysql.driver}") String driver) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}
