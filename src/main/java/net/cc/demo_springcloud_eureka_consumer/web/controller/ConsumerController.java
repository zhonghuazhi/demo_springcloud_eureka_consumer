package net.cc.demo_springcloud_eureka_consumer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @classname ConsumerController
 * @author: zhonghua.zhi
 * @date: 2019-05-13 22:30
 * @version: 1.0
 * @description: TODO
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/getHello", method = RequestMethod.GET)
    public String getHello() {

        /**
         * 此处的URL地址，忽略大小写
         */
        String result = restTemplate.getForObject("http://TEST-CLIENT/hello".toLowerCase(), String.class);
        System.out.println("result == " + result);

        return result;
    }
}