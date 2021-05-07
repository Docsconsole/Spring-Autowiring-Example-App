package com.docsconsole.tutorials.bytype.annotation;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class ASpringBean {

    private String aSpringBeanName;

    @Autowired
    private BSpringBean bSpringBean;

    public ASpringBean(String aSpringBeanName) {
        this.aSpringBeanName = aSpringBeanName;
    }

    public void displayASpringBean() {
        System.out.println(this.aSpringBeanName);
    }

}
