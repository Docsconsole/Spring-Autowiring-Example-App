package com.docsconsole.tutorials.byconstructor.xml.constructorarg;


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
