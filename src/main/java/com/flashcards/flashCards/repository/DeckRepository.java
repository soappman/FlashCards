package com.flashcards.flashCards.repository;

import com.flashcards.flashCards.entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeckRepository extends JpaRepository<Deck, UUID> {
}
