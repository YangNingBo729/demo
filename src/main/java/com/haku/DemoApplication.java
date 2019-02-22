package com.haku;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.haku.dao")
public class DemoApplication {
    //我在IDEA添加了注释哟
    //这次我就单纯的把commit后的版本库push到远程库
    //单纯commit 然后push
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    //这是另一个我添加的注释
    //我在这个地方又添加了一行注释
}