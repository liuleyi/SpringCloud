package com.springcloud.eurekaclient.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass().getName());
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public  String index(){
        ServiceInstance instance = client.getInstances("hello-service").get(0);
        client.description();
        logger.info("/hello,host:"+instance.getHost()+",service_id"+instance.getServiceId());
        return "Hello World";
    }


}
