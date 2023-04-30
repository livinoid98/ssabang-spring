package com.ssafy.ssabang.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

import com.ssafy.ssabang.notice.model.mapper.UserMapper;

@Configuration
@MapperScan(basePackageClasses = UserMapper.class)
public class ApplicationConfig {

}
