package com.rgs.pocproject.entity.testconfig;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Data
public class TestBean {

    private String username;
    private String url;
    private String password;

    public TestBean(){
        log.info("[Test Bean] Test bean is constructing");
    }

    public void sayHello() {
        log.info("[Test Bean] TestBean sayHello...");
    }

    @Override
    public String toString() {
        return String.format("username:%s,url:%s,password:%s",
                this.username,
                this.url,
                this.password);
    }

    public void start() {
        log.info("[Test Bean] TestBean initializing....");
    }

    public void cleanUp() {
        log.info("[Test Bean] TestBean destroying....");
    }
}
