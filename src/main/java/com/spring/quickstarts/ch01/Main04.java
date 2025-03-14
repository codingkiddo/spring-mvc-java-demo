package com.spring.quickstarts.ch01;

import java.util.function.Supplier;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.quickstarts.ch01.beans.Parrot;
import com.spring.quickstarts.ch01.config.ProjectConfig;

public class Main04 {
	public static void main(String[] args) {
		
		BeanFactory context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
//		Parrot parrot = new Parrot();
//		parrot.setName("MiKi");
//		
//		Supplier<Parrot> parrotSupplier = () -> parrot;
//		
//		AnnotationConfigApplicationContext applicationContext 
//						= (AnnotationConfigApplicationContext) context;
//		
////		applicationContext.registerBean(Parrot.class, parrotSupplier);
//		applicationContext.registerBean("parrot1", Parrot.class, parrotSupplier);
//		
//		Parrot parrotBean = context.getBean(Parrot.class);
//		
//		System.out.println(parrotBean.getName());
		
		( (AnnotationConfigApplicationContext) context ).close();
		
	}
}

