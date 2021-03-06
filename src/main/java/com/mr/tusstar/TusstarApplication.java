package com.mr.tusstar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@MapperScan("com.mr.tusstar.mapper")
@SpringBootApplication
public class TusstarApplication {

    public static void main(String[] args) {
        SpringApplication.run(TusstarApplication.class, args);
    }

}
