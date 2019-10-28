package com.martin.poc.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value={
            "",
            "/",
            "/index",
            "/home"
    })
    public String Home(){

        return "Hosted by Lunz";
    }
}
