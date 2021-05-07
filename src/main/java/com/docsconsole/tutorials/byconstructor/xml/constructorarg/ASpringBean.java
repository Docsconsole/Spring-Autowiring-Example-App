package com.docsconsole.tutorials.byconstructor.xml.constructorarg;


public class ASpringBean {



    private String aSpringBeanName;

    private BSpringBean bSpringBean2;

    private ASpringBean(BSpringBean bSpringBean){
        this.bSpringBean2 = bSpringBean;
    }


    public void displayASpringBean() {
        System.out.println(this.aSpringBeanName);
    }

    public String getaSpringBeanName() {
        return aSpringBeanName;
    }

    public void setaSpringBeanName(String aSpringBeanName) {
        this.aSpringBeanName = aSpringBeanName;
    }

    public BSpringBean getbSpringBean2() {
        return bSpringBean2;
    }

    public void setbSpringBean2(BSpringBean bSpringBean2) {
        this.bSpringBean2 = bSpringBean2;
    }
}
