package com.example.demo.controllers;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public long getTest() throws InterruptedException{
        long a = Math.round(Math.random()*1000);
        long b = Math.round(Math.random()*1000);
        long mod = 0;
        if(a>b && a!=0 && b!=0){
            mod = a%b;
        }
        if(b>a && a!=0 && b!=0){
            mod = b%a;
        }
        long timeout = (long)Math.random()*1000;
        TimeUnit.MILLISECONDS.sleep(timeout);
        return mod;
    }
}
