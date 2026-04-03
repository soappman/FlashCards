package com.flashcards.flashCards.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUserRequest{
    private String userName;
    private String email;
    private String password;
}
