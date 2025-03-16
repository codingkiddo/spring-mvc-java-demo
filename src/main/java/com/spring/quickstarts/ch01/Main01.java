package com.spring.quickstarts.ch01;

import java.util.function.Predicate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.quickstarts.ch01.beans.Parrot;
import com.spring.quickstarts.ch01.config.ProjectConfig;

public class Main01 {

	public static void main(String[] args) {

		BeanFactory context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
//		Predicate<T>
		
		Parrot parrot = context.getBean(Parrot.class);
		System.out.println(parrot.getName());
		
		String hello = context.getBean(String.class);
		System.out.println(hello);
		
		Integer ten = context.getBean(Integer.class);
		System.out.println(ten);		
		
		( (AnnotationConfigApplicationContext) context ).close();
		
	}

}
