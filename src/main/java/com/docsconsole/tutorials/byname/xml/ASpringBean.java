package com.docsconsole.tutorials.byname.xml;


public class ASpringBean {

    private String aSpringBeanName;

    private BSpringBean bSpringBean;

    public void displayASpringBean() {
        System.out.println(this.aSpringBeanName);
    }

    public String getaSpringBeanName() {
        return aSpringBeanName;
    }

    public void setaSpringBeanName(String aSpringBeanName) {
        this.aSpringBeanName = aSpringBeanName;
    }

    public BSpringBean getbSpringBean() {
        return bSpringBean;
    }

    public void setbSpringBean(BSpringBean bSpringBean) {
        this.bSpringBean = bSpringBean;
    }
}
