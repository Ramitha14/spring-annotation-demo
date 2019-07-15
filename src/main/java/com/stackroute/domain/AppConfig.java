package com.stackroute.domain;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    //Movie Bean
    @Bean
    public Movie movieBean1()
    {
        return new Movie(actorBean1());
    }

    //Actor Bean
    @Bean
    public Actor actorBean1()
    {
        return new Actor("ram","male",30);

    }
    //BeanLifecycleDemoBean
    @Bean(initMethod ="customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean lifeCycle1()
    {
        return new BeanLifecycleDemoBean();
    }
    @Bean
    public BeanPostProcessorDemoBean postProcessor()
    {
        return new BeanPostProcessorDemoBean();
    }


}
