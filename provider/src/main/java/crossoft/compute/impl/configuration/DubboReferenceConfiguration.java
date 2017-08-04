package crossoft.compute.impl.configuration;

import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import crossoft.compute.api.ComputeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ervin on 2017/8/2.
 */
@Configuration
public class DubboReferenceConfiguration {

    @Bean
    public ReferenceBean<ComputeService> computeServiceReferenceBean(RegistryConfig registry){
        ReferenceBean<ComputeService> referenceBean = new ReferenceBean<ComputeService>();
        referenceBean.setId( "computeService" );
        referenceBean.setInterface( ComputeService.class );
        referenceBean.setCheck( false );
        referenceBean.setVersion( "1.0" );
        referenceBean.setRegistry( registry );
        referenceBean.setProtocol( "dubbo" );
        referenceBean.setTimeout( 15000 );
        return referenceBean;
    }
}
