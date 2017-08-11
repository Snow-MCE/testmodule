package com.crossoft.configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.crossoft.api.ExposeBomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ervin on 2017/8/2.
 */
@Configuration
public class DubboServiceConfiguration{

    @Autowired
    ApplicationConfig applicationConfig;

    @Bean
    public ServiceBean<ExposeBomService> exposeBomServiceServiceConfig(ExposeBomService exposeBomService, RegistryConfig registry ){
        ServiceBean<ExposeBomService> serviceBean = new ServiceBean<ExposeBomService>();
        serviceBean.setInterface( ExposeBomService.class.getName() );
        serviceBean.setRef( exposeBomService );
        serviceBean.setVersion( "1.0" );
        serviceBean.setRegistry( registry );
        serviceBean.setOwner( "Snow");
        serviceBean.setLoadbalance( "random" );
        serviceBean.setActives(0);
        serviceBean.setExecutes( 200 );
        serviceBean.setApplication( applicationConfig );
        return serviceBean;
    }

}
