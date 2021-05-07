package com.docsconsole.tutorials.qualifier.annotation;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
@Setter
public class ASpringBean {

    private String aSpringBeanName;

    @Autowired
    @Qualifier("cSpringBean")
    private ISpringBean iSpringBean;

    public ASpringBean(String aSpringBeanName) {
        this.aSpringBeanName = aSpringBeanName;
    }

    public void displayASpringBean() {
        System.out.println(this.aSpringBeanName);
    }

}
