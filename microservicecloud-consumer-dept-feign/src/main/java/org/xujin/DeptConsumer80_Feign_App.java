package org.xujin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author xujin
 * @package-name org.xujin
 * @createtime 2020-03-22 17:44
 */

@SpringBootApplication
@EnableEurekaClient
//使@FeignClient(value = "MICROSERVICECLOUD-DEPT")生效
@EnableFeignClients(basePackages= {"org.xujin.service"})
public class DeptConsumer80_Feign_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
