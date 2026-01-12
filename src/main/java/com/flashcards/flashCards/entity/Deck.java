package com.flashcards.flashCards.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table
public class Deck {


    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String deckName;

    @Column
    private String deckDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Lob
    private Byte[] image;

    @OneToMany(mappedBy = "deck", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FlashCard> cards = new HashSet<>();

    protected Deck () {
    }

    public Deck(String deckName, String deckDescription) {
        this.deckName = deckName;
        this.deckDescription = deckDescription;
    }

}
