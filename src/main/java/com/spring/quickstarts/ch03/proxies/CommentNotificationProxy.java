package com.spring.quickstarts.ch03.proxies;

import com.spring.quickstarts.ch03.model.Comment;

public interface CommentNotificationProxy {

  void sendComment(Comment comment);
}
