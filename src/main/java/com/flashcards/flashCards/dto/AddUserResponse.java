package com.flashcards.flashCards.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AddUserResponse {
    private UUID id;
    private String email;
}
