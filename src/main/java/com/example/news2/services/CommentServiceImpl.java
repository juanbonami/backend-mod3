package com.example.news2.services;

import com.example.news2.models.Comment;
import com.example.news2.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Iterable<Comment> listComment() {
        return commentRepository.findAll();
    }

}
