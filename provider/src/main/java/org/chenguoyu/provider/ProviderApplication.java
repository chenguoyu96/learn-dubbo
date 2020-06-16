package org.chenguoyu.provider;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot与dubbo整合的三种方式：
 * 1）、导入dubbo-starter，在application.properties配置属性，使用@Service【暴露服务】使用@Reference【引用服务】 缺点是无法针对每个方法设置超时事件和重置次数
 * 2）、保留dubbo xml配置文件; 缺点是必须引入xml配置文件
 * 导入dubbo-starter，使用@ImportResource导入dubbo的配置文件即可
 * 3）、使用注解API的方式：
 * 将每一个组件手动创建到容器中,让dubbo来扫描其他的组件
 */
@EnableDubbo
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
