package com.jkx.chongshoumicropink;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.jkx.chongshoumicropink.mapper"})
public class ChongshoumicropinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChongshoumicropinkApplication.class, args);
    }

}
