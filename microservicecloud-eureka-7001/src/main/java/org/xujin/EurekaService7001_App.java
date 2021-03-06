package org.xujin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xujin
 * @package-name org.xujin
 * @createtime 2020-03-24 17:29
 */
@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaService7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7001_App.class,args);
    }
}
