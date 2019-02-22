package com.haku;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.haku.dao")
public class DemoApplication {
    //我在IDEA添加了注释哟
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
