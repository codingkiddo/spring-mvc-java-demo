package com.spring.quickstarts.ch03.repositories;

import com.spring.quickstarts.ch03.model.Comment;

public interface CommentRepository {
  void storeComment(Comment comment);
}
