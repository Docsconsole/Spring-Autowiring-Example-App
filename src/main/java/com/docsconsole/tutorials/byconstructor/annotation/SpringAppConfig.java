package com.docsconsole.tutorials.byconstructor.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfig {

    @Bean
    public ASpringBean aSpringBean() {
        return new ASpringBean("ASpringBean", bSpringBean());
    }

    @Bean
    public BSpringBean bSpringBean() {
        return new BSpringBean("BSpringBean");
    }

}
