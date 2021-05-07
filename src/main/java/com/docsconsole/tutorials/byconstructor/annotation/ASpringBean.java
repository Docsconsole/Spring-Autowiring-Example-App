package com.docsconsole.tutorials.byconstructor.annotation;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class ASpringBean {

    private String aSpringBeanName;

    private BSpringBean bSpringBean;

    @Autowired
    public ASpringBean(String aSpringBeanName, BSpringBean bSpringBean) {
        this.aSpringBeanName = aSpringBeanName;
        this.bSpringBean = bSpringBean;
    }

    public void displayASpringBean() {
        System.out.println(this.aSpringBeanName);
    }

}
