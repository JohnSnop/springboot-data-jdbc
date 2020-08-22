package com.wf.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wf
 * @create 2020-08-22 10:39
 * @desc druid数据源配置
 **/
@Configuration
public class DruidConfig {

    @Value("${spring.datasource.druid.loginName}")
    private String userName;
    @Value("${spring.datasource.druid.loginPwd}")
    private String passWord;

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }

    // 配置Druid的监控
    // 1、配置一个管理后台的Servlet
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

        Map<String, String> initMap = new HashMap<>();

        initMap.put("loginUsername", userName);
        initMap.put("loginPassword", passWord);
        initMap.put("allow","");// 默认就是允许所有访问
        initMap.put("deny","192.168.15.21");

        registrationBean.setInitParameters(initMap);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new WebStatFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/*"));

        Map<String, String> initMap = new HashMap<>();
        initMap.put("exclusions", "*.js, *.css, /druid/*");
        registrationBean.setInitParameters(initMap);

        return registrationBean;
    }
}
