package com.flashcards.flashCards.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.nio.ByteBuffer;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="flash_card")
public class FlashCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private String cardName;

    @Column(nullable = false)
    private String question;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deck_id", nullable = false)
    private Deck deck;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String description;

    @Column
    private Byte[] image;

    @Column
    private String URL;

    protected FlashCard () {
    }

    public FlashCard(UUID id, String cardName, String question, String description, Byte[] image, String URL) {
        this.id = id;
        this.cardName = cardName;
        this.question = question;
        this.description = description;
        this.image = image;
        this.URL = URL;
    }

}
