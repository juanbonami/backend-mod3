package com.example.news2.services;

import com.example.news2.models.Comment;

public interface CommentService {
    public Comment createComment(Comment comment);

    public Iterable<Comment> listComment();
}
