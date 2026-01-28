package com.flashcards.flashCards.repository;

import com.flashcards.flashCards.entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface DeckRepository extends JpaRepository<Deck, UUID> {
}
