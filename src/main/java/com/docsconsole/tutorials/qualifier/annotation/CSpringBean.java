package com.docsconsole.tutorials.qualifier.annotation;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CSpringBean implements ISpringBean{

    private String cSpringBeanName;

    public CSpringBean(String cSpringBeanName) {
        this.cSpringBeanName = cSpringBeanName;
    }

    public void displaySpringBean() {
        System.out.println(this.cSpringBeanName);
    }
}
