package com.spring.quickstarts.ch01.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name;

    @PostConstruct
    public void init() {
    	System.out.println("init() ..Parrot");
    	this.name = "KiWi";
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @PreDestroy
    public void destroy() {
    	System.out.println("destroy() ..Parrot");
    }
}
