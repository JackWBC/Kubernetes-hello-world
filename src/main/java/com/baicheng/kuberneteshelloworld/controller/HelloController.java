package com.baicheng.kuberneteshelloworld.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author baicheng
 * @description
 * @create 2019-08-26 15:59
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/services")
    public List<String> services(){
        return discoveryClient.getServices();
    }
}
