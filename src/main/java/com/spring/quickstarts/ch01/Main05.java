package com.spring.quickstarts.ch01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.quickstarts.ch01.beans.Parrot;
import com.spring.quickstarts.ch01.beans.Person;
import com.spring.quickstarts.ch01.config.ProjectConfig;

public class Main05 {
	public static void main(String[] args) {
		
		BeanFactory context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Parrot parrot = context.getBean(Parrot.class);
		System.out.println(parrot.getName());
		
		Person person = context.getBean(Person.class);
		System.out.println(person);
		
		System.out.println(person.getParrot());
		
		( (AnnotationConfigApplicationContext) context ).close();
		
	}
}

