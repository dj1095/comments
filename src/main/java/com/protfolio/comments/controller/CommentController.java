package com.protfolio.comments.controller;

import com.protfolio.comments.model.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommentController {

    @GetMapping("/all/comments")
    public List<Comment> getAllComments(){
        List<Comment> comments = new ArrayList<>();
        comments.add(Comment.builder().email("pr@gmail.com").comment("Hey All There").build());
        return comments;
    }
}
