package com.spring.quickstarts.ch03.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.quickstarts.ch03.model.Comment;

@Component
@Qualifier("email")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending email notification for comment: " + comment.getText());
  }
}
