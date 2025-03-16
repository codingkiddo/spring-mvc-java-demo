package com.spring.quickstarts.ch03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.quickstarts.ch03.configuration.ProjectConfiguration;
import com.spring.quickstarts.ch03.model.Comment;
import com.spring.quickstarts.ch03.services.CommentService;

public class Main01 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		Comment comment = new Comment();
		comment.setAuthor("Laurentiu");
		comment.setText("Demo comment");
		
		CommentService commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
		
		context.close();
		
	}

}
