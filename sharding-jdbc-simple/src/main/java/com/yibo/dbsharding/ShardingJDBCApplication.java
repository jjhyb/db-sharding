package com.yibo.dbsharding;

import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//@SpringBootApplication(exclude = SpringBootConfiguration.class) //sharding-jdbc java代码配置方式
@SpringBootApplication
@MapperScan("com.yibo.dbsharding.mapper")
public class ShardingJDBCApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJDBCApplication.class,args);
    }
}
