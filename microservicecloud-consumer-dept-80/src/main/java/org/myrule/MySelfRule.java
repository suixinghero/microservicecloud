package org.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xujin
 * @package-name org.myrule
 * @createtime 2020-03-27 13:07
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule iRule(){
        return new RandomFiveTimesRule();
    }
}
