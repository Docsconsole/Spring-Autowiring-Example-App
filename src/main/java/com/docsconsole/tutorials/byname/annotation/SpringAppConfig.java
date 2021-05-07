package com.docsconsole.tutorials.byname.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfig {

    @Bean
    public ASpringBean aSpringBean() {
        return new ASpringBean("ASpringBean");
    }

    @Bean("bSpringBean")
    public BSpringBean bSpringBean() {
        return new BSpringBean("BSpringBean");
    }

    @Bean("bSpringBean1")
    public BSpringBean bSpringBean1() {
        return new BSpringBean("BSpringBean1");
    }

}
