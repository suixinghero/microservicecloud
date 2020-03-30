package org.xujin.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xujin
 * @package-name org.xujin.entity.cfgbeans
 * @createtime 2020-03-24 16:35
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
    @Bean
    public IRule iRule(){
        //return new RandomRule();//我们重新选择的随机算法替代默认的轮询
        return new RetryRule();//先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
    }

}
