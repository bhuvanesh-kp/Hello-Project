package com.tarun.help.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class HelperEndpoint {
    @GetMapping("/hello")
    public String Service1(){
        return "hello world from me";
    }
}
