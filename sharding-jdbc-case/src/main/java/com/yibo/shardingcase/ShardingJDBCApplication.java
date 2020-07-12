package com.yibo.shardingcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.yibo.shardingcase.mapper")
public class ShardingJDBCApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShardingJDBCApplication.class,args);
    }
}
