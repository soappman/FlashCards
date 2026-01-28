package com.flashcards.flashCards.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CreateDeckResponse {

    private String deckName;

    private String deckDescription;

    private UUID id;

}
