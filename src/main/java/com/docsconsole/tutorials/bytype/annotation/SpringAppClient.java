package com.docsconsole.tutorials.bytype.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppClient {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        context.registerShutdownHook();

        //
        ASpringBean aSpringBean = context.getBean(ASpringBean.class);
        aSpringBean.displayASpringBean();
        aSpringBean.getBSpringBean().displayBSpringBean();


    }
}