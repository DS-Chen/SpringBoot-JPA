package com.study.springboot.mybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author chendongsuo
 * @create 2018-07-04 9:14
 * @email dongsuo.chen@nvr-china.com
 * @description 实例化Druid Datasource
 */
@Configuration
public class DruidConfiguration {
    private Logger logger = LoggerFactory.getLogger(DruidConfiguration.class);

    /**
     * @ConfigurationProperties 会把配置文件的参数自动赋值到dataSource里。
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    /**
     * 配置界面监控
     */

    @Bean
    public ServletRegistrationBean druidStatViewServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        //IP白名单
        registrationBean.addInitParameter("allow", "127.0.0.1");
        //IP黑名单(deny 优于 allow)
        registrationBean.addInitParameter("deny", "");
        //登录druid的账号
        registrationBean.addInitParameter("loginUsername", "cds");
        //登录druid的密码
        registrationBean.addInitParameter("loginPassword", "123456");
        //是否能重置数据
        registrationBean.addInitParameter("resetEnable", "false");
        return registrationBean;
    }

    /**
     * 配置过滤器
     */
    @Bean
    public FilterRegistrationBean druidWebStatViewFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new WebStatFilter());
        //添加过滤规则
        registrationBean.addInitParameter("urlPatterns", "/*");
        //添加不需要忽略的格式信息
        registrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.css,*.ico,/druid/*");
        return registrationBean;
    }
}
