package com.jsf.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description
 * @FileName SpringConfig
 * @Author JSF
 * @date 2024-11-12
 **/
@Configuration
@ComponentScan({"com.jsf.ssm.service"})
@PropertySource("classpath:jdbc.properties")
@Import({DataSourceConfig.class, MyBatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}

