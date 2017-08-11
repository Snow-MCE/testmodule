package com.crossoft.configuration;


import com.alibaba.dubbo.config.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ervin on 2017/8/2.
 */
@Configuration
public class DubboBaseConfiguration {

    @Bean
    public ApplicationConfig applicationConfig(@Value( "${dubbo.application.name}" ) String name ){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName( name );
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registry( @Value("${dubbo.registry.address}") String address ){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setId( "zookeeper" );
        registryConfig.setProtocol( "zookeeper" );
        registryConfig.setAddress( address );
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocol(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName( "dubbo" );
        protocolConfig.setPort( 30002);
        protocolConfig.setDispatcher( "all" );
        protocolConfig.setThreadpool( "cached" );
        protocolConfig.setThreads( 200 );
        return protocolConfig;
    }

    @Bean
    public MonitorConfig monitorConfig() {
        MonitorConfig mc = new MonitorConfig();
        mc.setProtocol("registry");
        return mc;
    }

    @Bean
    public ReferenceConfig referenceConfig() {
        ReferenceConfig rc = new ReferenceConfig();
        rc.setMonitor(monitorConfig());
        return rc;
    }

    @Bean
    public ProviderConfig provider() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setMonitor(monitorConfig());
        return providerConfig;
    }

}
