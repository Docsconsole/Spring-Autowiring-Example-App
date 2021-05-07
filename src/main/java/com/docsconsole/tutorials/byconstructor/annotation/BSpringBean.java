package com.docsconsole.tutorials.byconstructor.annotation;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BSpringBean {

    private String bSpringBeanName;

    public BSpringBean(String bSpringBeanName) {
        this.bSpringBeanName = bSpringBeanName;
    }
    public void displayBSpringBean() {
        System.out.println(this.bSpringBeanName);
    }
}
