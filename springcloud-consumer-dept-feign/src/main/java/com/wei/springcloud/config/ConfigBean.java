package com.wei.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/***
 *                    .::::.
 *                  .::::::::.
 *                 :::::::::::  
 *             ..:::::::::::'
 *           '::::::::::::'
 *             .::::::::::
 *        '::::::::::::::..
 *             ..::::::::::::.
 *           ``::::::::::::::::
 *            ::::``:::::::::'        .:::.
 *           ::::'   ':::::'       .::::::::.
 *         .::::'      ::::     .:::::::'::::.
 *        .:::'       :::::  .:::::::::' ':::::.
 *       .::'        :::::.:::::::::'      ':::::.
 *      .::'         ::::::::::::::'         ``::::.
 *  ...:::           ::::::::::::'              ``::.
 * ```` ':.          ':::::::::'                  ::::..
 *                    '.:::::'                    ':'````..
 *  @data 2020/5/9 16:17
 *  @author lw
 */
@Configuration
public class ConfigBean {
    //配置负载均衡
    //AvailabilityFilteringRule 先过滤掉跳闸的服务，对剩下的进行轮询
    //RandomRule 随机访问
    //RoundRobinRule  轮询
    //RetryRule ：会先按照轮询获取服务 如果失败，则会在指定的时间内重试
    @Bean
    @LoadBalanced//Ribbon
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
