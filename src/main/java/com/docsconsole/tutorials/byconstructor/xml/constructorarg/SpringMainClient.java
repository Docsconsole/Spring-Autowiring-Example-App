package com.docsconsole.tutorials.byconstructor.xml.constructorarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AmarSivas
 * @version 1.0
 * @since 13-Jul-2019
 */
public class SpringMainClient {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");

		ASpringBean aSpringBean = context.getBean("aSpringBean", ASpringBean.class);

		aSpringBean.displayASpringBean();
		aSpringBean.getbSpringBean2().displayBSpringBean();
		
	}

}
