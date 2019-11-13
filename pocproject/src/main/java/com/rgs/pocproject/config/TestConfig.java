package com.rgs.pocproject.config;

import com.rgs.pocproject.entity.testconfig.TestBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Configuration
@Slf4j
public class TestConfig {

    public TestConfig(){
        log.info("[Test Config]Springboot is starting");
    }

    @Bean(name = "TestBean",initMethod = "start",destroyMethod = "cleanUp")
    //@Scope("prototype")
    @Scope
    public TestBean testBean(){

        TestBean testBean=new TestBean();
        testBean.setUsername("Kitty");
        testBean.setUrl("Http://HelloKitty");
        testBean.setPassword("123");
        return testBean;
    }
}
