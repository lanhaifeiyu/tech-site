package com.lhfeiyu.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author:wangaimin
 * @date:2019/5/20 22:46
 * @description:
 */

@SpringBootApplication
@EnableSwagger2
//SpringBoot默认扫描路径为当前包和子包，无法扫描到business中的包，需要自己添加
//@ComponentScan(basePackages = {"com.lhfeiyu.api","com.lhfeiyu.business"})
@ComponentScan(basePackages = "com.lhfeiyu")
public class ApiApplication {
    public static void main(String[] args){
        SpringApplication.run(ApiApplication.class, args);
        }
}
