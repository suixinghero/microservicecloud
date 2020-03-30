package org.xujin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xujin
 * @package-name org.xujin
 * @createtime 2020-03-28 19:07
 */

@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
    }
}

