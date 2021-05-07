package com.docsconsole.tutorials.qualifier.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfig {

    @Bean
    public ASpringBean aSpringBean() {
        return new ASpringBean("ASpringBean");
    }

    @Bean("bSpringBean")
    public ISpringBean bSpringBean() {
        return new BSpringBean("BSpringBean");
    }

    @Bean("cSpringBean")
    public ISpringBean cSpringBean() {
        return new CSpringBean("CSpringBean");
    }

}
