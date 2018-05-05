/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.helloworldmvcannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author javaBrat
 */
@Configuration
@ComponentScan(basePackages = {"com.beginningspring.helloworldmvcannotation"})
public class AppConfig {
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver(){
        InternalResourceViewResolver irvs = new InternalResourceViewResolver();
        irvs.setPrefix("/WEB-INF/");
        irvs.setSuffix(".jsp");
        return irvs;
    }
    
}
