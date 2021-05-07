package com.docsconsole.tutorials.qualifier.annotation;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BSpringBean implements ISpringBean{

    private String bSpringBeanName;

    public BSpringBean(String bSpringBeanName) {
        this.bSpringBeanName = bSpringBeanName;
    }

    public void displaySpringBean() {
        System.out.println(this.bSpringBeanName);
    }
}
