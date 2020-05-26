package com.example.news2.controller;

import com.example.news2.models.Comment;
import com.example.news2.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class ControllerThree {
    @Autowired
    CommentService commentService;

    @GetMapping
    public Iterable<Comment> listComment() {
        return commentService.listComment();
    }


    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }
}
