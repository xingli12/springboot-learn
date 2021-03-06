package com.lx.springbootlearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Demo class
 *
 * @author lixing12
 * @date 2018/08/02
 */
@SpringBootApplication
@EnableCaching
@MapperScan("com.lx.springbootlearn.dao")
public class SpringbootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLearnApplication.class, args);
    }
}
