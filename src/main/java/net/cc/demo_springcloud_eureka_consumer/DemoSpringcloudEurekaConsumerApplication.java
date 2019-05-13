package net.cc.demo_springcloud_eureka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoSpringcloudEurekaConsumerApplication {

    /**
     * 功能描述:
     *
     * @param
     * @return: org.springframework.web.client.RestTemplate
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-05-13 22:29
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudEurekaConsumerApplication.class, args);
    }
}