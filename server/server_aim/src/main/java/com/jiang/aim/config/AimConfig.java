package com.jiang.aim.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.jiang.aim.mapper")
public class AimConfig {

}
