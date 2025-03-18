package com.spring.quickstarts.ch03.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.spring.quickstarts.ch03.model.Comment;


@Component
@Primary
@Qualifier("push")
public class CommentPushNotificationProxy implements  CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {

		System.out.println(
				"Sending push notification for comment: "
				+ comment.getText());
		
	}
	
}
