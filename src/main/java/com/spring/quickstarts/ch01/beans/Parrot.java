package com.spring.quickstarts.ch01.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

//	@Value("${parrot.name}")
    private String name = "KoKo";

    final private Person person;
    
//    @PostConstruct
//    public void init() {
//    	System.out.println("init() ..Parrot");
//    	this.name = "KiWi";
//    }
    
    @Autowired
    public Parrot(Person person) {
    	this.person = person;
    }
    
    public String getName() {
        return name;
    }

    public Person getPerson() {
		return person;
	}

	public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
    	return "Parrot : " + name;
    }
    
//    @PreDestroy
//    public void destroy() {
//    	System.out.println("destroy() ..Parrot");
//    }
}
