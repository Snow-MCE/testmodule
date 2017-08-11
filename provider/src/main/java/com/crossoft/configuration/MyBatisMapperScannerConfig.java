package com.crossoft.configuration;

import com.crossoft.mapper.MainMapper;
import org.apache.log4j.Logger;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Snow on 7/11/2017.
 */
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {

    private final static Logger logger = Logger.getLogger(MyBatisConfig.class);
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.crossoft.mapper");
        mapperScannerConfigurer.setAnnotationClass(MainMapper.class);
        return mapperScannerConfigurer;
    }
}
