package com.flashcards.flashCards.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.nio.ByteBuffer;
import java.util.UUID;

@Table
public class FlashCard {

    @PrimaryKey
    private UUID id;

    private String cardName;

    private String question;

    private String description;

    private ByteBuffer image;

    private String URL;

    public FlashCard(UUID id, String cardName, String question, String description, ByteBuffer image, String URL) {
        this.id = id;
        this.cardName = cardName;
        this.question = question;
        this.description = description;
        this.image = image;
        this.URL = URL;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ByteBuffer getImage() {
        return image;
    }

    public void setImage(ByteBuffer image) {
        this.image = image;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
