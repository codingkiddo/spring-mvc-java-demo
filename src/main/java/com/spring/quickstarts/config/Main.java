package com.spring.quickstarts.config;

import java.lang.reflect.Modifier;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.WebApplicationInitializer;

public class Main {

	public static void main(String[] args) {
		
		Class<?> classInstanceAbstractSecurityWebApplicationInitializer = AbstractSecurityWebApplicationInitializer.class;
		Class<?> classInstanceSecurityWebInitializer = SecurityWebInitializer.class;
		
		Class<?> classMain = Main.class;
		
		System.out.println(classInstanceAbstractSecurityWebApplicationInitializer);
		System.out.println(Modifier.isAbstract(classInstanceAbstractSecurityWebApplicationInitializer.getModifiers()));
		System.out.println(WebApplicationInitializer.class.isAssignableFrom(classInstanceAbstractSecurityWebApplicationInitializer));
		System.out.println(WebApplicationInitializer.class.isAssignableFrom(classMain));
		
		System.out.println(classInstanceSecurityWebInitializer);
		System.out.println(Modifier.isAbstract(classInstanceSecurityWebInitializer.getModifiers()));
		System.out.println(WebApplicationInitializer.class.isAssignableFrom(classInstanceSecurityWebInitializer));
		
		System.out.println("Ok");
		
		
		Animal a = name -> System.out.println(name);
		
	}
}


//abstract class Animal {
//	abstract void print(String name);
//}

interface Animal {
	abstract void print(String name);
}