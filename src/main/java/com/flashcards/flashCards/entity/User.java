package com.flashcards.flashCards.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Set;
import java.util.UUID;

@Table
public class User {

    @PrimaryKey
    private UUID id;

    private String userName;

    private String email;

    private Set<String> decks;

    public User(UUID id, String name, String email, Set<String> decks) {
        this.id = id;
        this.userName = name;
        this.email = email;
        this.decks = decks;
    }

    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getDecks() {
        return decks;
    }

    public void setDecks(Set<String> decks) {
        this.decks = decks;
    }
}
