package crossoft.compute.impl.configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import crossoft.compute.api.BomConfigService;
import crossoft.compute.api.ComputeProxyService;
import crossoft.compute.api.WelcomeService;
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
    public ServiceBean<WelcomeService> welcomeServiceServiceConfig(WelcomeService welcomeService, RegistryConfig registry ){
        ServiceBean<WelcomeService> serviceBean = new ServiceBean<WelcomeService>();
        serviceBean.setInterface( WelcomeService.class.getName() );
        serviceBean.setRef( welcomeService );
        serviceBean.setVersion( "1.0" );
        serviceBean.setRegistry( registry );
        serviceBean.setOwner( "ervin");
        serviceBean.setLoadbalance( "random" );
        serviceBean.setActives(0);
        serviceBean.setExecutes( 200 );
        serviceBean.setApplication( applicationConfig );
        //serviceBean.setApplication( new ApplicationConfig( "cosumerssss" ) );
        return serviceBean;
    }

    @Bean
    public ServiceBean<ComputeProxyService> computeProxyServiceServiceConfig(ComputeProxyService computeProxyService, RegistryConfig registry ){
        ServiceBean<ComputeProxyService> serviceBean = new ServiceBean<ComputeProxyService>();
        serviceBean.setInterface( ComputeProxyService.class.getName() );
        serviceBean.setRef( computeProxyService );
        serviceBean.setVersion( "1.0" );
        serviceBean.setRegistry( registry );
        serviceBean.setOwner( "ervin");
        serviceBean.setLoadbalance( "random" );
        serviceBean.setActives(0);
        serviceBean.setExecutes( 200 );
        serviceBean.setApplication( applicationConfig );
        //serviceBean.setApplication( new ApplicationConfig( "cosumerxxx" ) );
        return serviceBean;
    }

    @Bean
    public ServiceBean<BomConfigService> bomConfigServiceConfig(BomConfigService bomConfigService, RegistryConfig registry ){
        ServiceBean<BomConfigService> serviceBean = new ServiceBean<BomConfigService>();
        serviceBean.setInterface( BomConfigService.class.getName() );
        serviceBean.setRef( bomConfigService );
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
