package org.xujin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xujin
 * @package-name org.xujin
 * @createtime 2020-03-25 14:15
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7002_App.class,args);
    }
}
