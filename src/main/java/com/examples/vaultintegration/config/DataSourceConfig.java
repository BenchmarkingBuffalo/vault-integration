package com.examples.vaultintegration.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@ConfigurationProperties("application")
@Data
public class DataSourceConfig {
    //@Value("${database.username}")
    private String username;

    //@Value("${database.password}")
    private String password;

    //@Value("${spring.datasource.url}")
    private String url;

    /*@Bean
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .username(username)
                .password(password)
                .url(url)
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }*/
}
