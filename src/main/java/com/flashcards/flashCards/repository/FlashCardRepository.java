package com.flashcards.flashCards.repository;

import com.flashcards.flashCards.entity.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FlashCardRepository extends JpaRepository<FlashCard, UUID> {
}
