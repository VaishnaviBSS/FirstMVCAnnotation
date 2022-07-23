package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.example.springMVCXML", "com.example.service","com.example"})
public class SpringConfig {
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver vr =new InternalResourceViewResolver();
        vr.setPrefix("/");
        vr.setSuffix(".jsp");
        return vr ;
    }
}
