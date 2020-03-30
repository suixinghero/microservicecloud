package org.xujin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xujin
 * @package-name org.xujin
 * @createtime 2020-03-22 17:14
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@MapperScan("org.xujin.dao")
@EnableDiscoveryClient //服务发现
public class DeptProvider8002_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_APP.class, args);
    }
}
