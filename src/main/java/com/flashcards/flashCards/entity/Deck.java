package com.flashcards.flashCards.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.nio.ByteBuffer;
import java.util.Set;
import java.util.UUID;

@Table
public class Deck {

    @PrimaryKey
    private UUID id;

    private String deckName;

    private String deckDescription;

    private ByteBuffer image;

    private Set<String> cards;


}
