package com.docsconsole.tutorials.byname.annotation;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
@Setter
public class ASpringBean {

    private String aSpringBeanName;

    @Autowired
    @Qualifier("bSpringBean1")
    private BSpringBean bSpringBean;

    public ASpringBean(String aSpringBeanName) {
        this.aSpringBeanName = aSpringBeanName;
    }

    public void displayASpringBean() {
        System.out.println(this.aSpringBeanName);
    }

}
