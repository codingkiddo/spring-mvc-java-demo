package com.spring.quickstarts.ch01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.quickstarts.ch01.beans.Parrot;

@Configuration
@ComponentScan(basePackages = {"com.spring.quickstarts.ch01.beans"})
public class ProjectConfig {

//	@Bean
//	public Parrot parrot1() {
//		Parrot p = new Parrot();
//		p.setName("KoKo");
//		return p;
//	}
//	
//	@Bean
//	public Parrot parrot2() {
//		Parrot p = new Parrot();
//		p.setName("MiKi");
//		return p;
//	}
//	
//	@Bean
//	@Primary
//	public Parrot parrot3() {
//		Parrot p = new Parrot();
//		p.setName("RiKi");
//		return p;
//	}
	
//	@Bean(name="koko")
//	public Parrot parrot1() {
//		Parrot p = new Parrot();
//		p.setName("KoKo");
//		return p;
//	}
//	
//	@Bean(value="miki")
//	public Parrot parrot2() {
//		Parrot p = new Parrot();
//		p.setName("MiKi");
//		return p;
//	}
//	
//	@Bean("riki")
//	public Parrot parrot3() {
//		Parrot p = new Parrot();
//		p.setName("RiKi");
//		return p;
//	}
	
//	expected single matching bean but found 3: parrotKoKo,parrotMiKi,parrotRiKi
	
//	@Bean
//	public Parrot parrotKoKo() {
//		Parrot p = new Parrot();
//		p.setName("KoKo");
//		return p;
//	}
//	
//	@Bean
//	public Parrot parrotMiKi() {
//		Parrot p = new Parrot();
//		p.setName("MiKi");
//		return p;
//	}
//	
//	@Bean
//	public Parrot parrotRiKi() {
//		Parrot p = new Parrot();
//		p.setName("RiKi");
//		return p;
//	}
	
	@Bean
	public String hello() {
		return "hello";
	}
	
	@Bean
	public Integer ten() {
		return 10;
	}
}
