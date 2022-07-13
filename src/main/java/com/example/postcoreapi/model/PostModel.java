package com.example.postcoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@AllArgsConstructor
@Data
@NoArgsConstructor

public class PostModel {
//    @NotNull(message = "Post id cannot be null")
    private String postId;
//    @NotNull(message = "Client id cannot be null")
    private String clientId;
    @Size(min=5, max=20,message = "Name of client must be greater than 2 and less than 16")
    private String nameOfClient;
//    @NotNull(message = "postRecipientId cannot be null")
    private String postRecipientId;
    @Size(min=5, max=20,message = "Name of recipient must be greater than 2 and less than 16")
    private String nameOfRecipient;
    private String postItem;
    private String status;

}
