package com.flashcards.flashCards.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class GetDeckResponse {

    private UUID id;

    private String deckName;

    private String deckDescription;

}