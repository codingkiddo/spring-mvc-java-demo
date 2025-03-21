package com.spring.quickstarts.ch03.repositories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.quickstarts.ch03.model.Comment;

@Component
@Repository
public class DBCommentRepository implements CommentRepository {

  @Override
  public void storeComment(Comment comment) {
    System.out.println("Storing comment: " + comment.getText());
  }
}
