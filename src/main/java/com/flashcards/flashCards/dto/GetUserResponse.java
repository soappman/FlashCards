package com.flashcards.flashCards.dto;


import com.flashcards.flashCards.entity.Deck;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class GetUserResponse {
    private UUID id;
    private String userName;
    private String email;
    private Set<Deck> decks;
}
