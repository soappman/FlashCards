package com.flashcards.flashCards.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateDeckRequest {

    private String deckName;

    private String deckDescription;

}
