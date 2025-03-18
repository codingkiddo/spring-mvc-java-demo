package com.spring.quickstarts.ch03.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.quickstarts.ch03.model.Comment;
import com.spring.quickstarts.ch03.proxies.CommentNotificationProxy;
import com.spring.quickstarts.ch03.repositories.CommentRepository;

@Service
@Component
public class CommentService {

	private final CommentRepository commentRepository;

	private final CommentNotificationProxy commentNotificationProxy;

	public CommentService(CommentRepository commentRepository, 
			@Qualifier("email") CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}

	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}
