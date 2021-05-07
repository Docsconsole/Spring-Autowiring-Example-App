package com.docsconsole.tutorials.bytype.xml;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class BSpringBean {

    private String bSpringBeanName;

    public void displayBSpringBean() {
        System.out.println(this.bSpringBeanName);
    }

    public String getbSpringBeanName() {
        return bSpringBeanName;
    }

    public void setbSpringBeanName(String bSpringBeanName) {
        this.bSpringBeanName = bSpringBeanName;
    }
}
