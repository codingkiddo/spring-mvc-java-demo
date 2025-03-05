package com.spring.quickstarts.ch01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.quickstarts.ch01.beans.Parrot;
import com.spring.quickstarts.ch01.config.ProjectConfig;

public class Main02 {

	public static void main(String[] args) {

		BeanFactory context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
//		Parrot parrot = context.getBean("parrot2", Parrot.class);
		Parrot parrot = context.getBean(Parrot.class);
		System.out.println(parrot.getName());
		

		
		
		( (AnnotationConfigApplicationContext) context ).close();
		
	}

}
