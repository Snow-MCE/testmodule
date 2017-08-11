package com.crossoft.configuration;

import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.crossoft.api.ExposeBomService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ervin on 2017/8/2.
 */
@Configuration
public class DubboReferenceConfiguration {

    @Bean
    public ReferenceBean<ExposeBomService> exposeBomServiceReferenceBean(RegistryConfig registry){
        ReferenceBean<ExposeBomService> referenceBean = new ReferenceBean<ExposeBomService>();
        referenceBean.setId( "exposeBomService" );
        referenceBean.setInterface( ExposeBomService.class );
        referenceBean.setCheck( false );
        referenceBean.setVersion( "1.0" );
        referenceBean.setRegistry( registry );
        referenceBean.setProtocol( "dubbo" );
        referenceBean.setTimeout( 15000 );
        return referenceBean;
    }
}
