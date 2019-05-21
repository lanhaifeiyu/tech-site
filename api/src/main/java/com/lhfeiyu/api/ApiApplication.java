package com.lhfeiyu.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author:wangaimin
 * @date:2019/5/20 22:46
 * @description:
 */

@SpringBootApplication
@EnableSwagger2
public class ApiApplication {
    public static void main(String[] args){
        SpringApplication.run(ApiApplication.class, args);
        }
}
