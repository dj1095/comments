package com.protfolio.comments.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;

@Data
@Builder
public class Comment {
    @Email
    private String email;
    private String comment;
}
