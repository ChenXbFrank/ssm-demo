package com.cxb.ssm.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(){
        return "hello springMvc!";
    }
}
