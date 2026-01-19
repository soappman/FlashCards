package com.flashcards.flashCards.service;

import com.flashcards.flashCards.dto.AddUserRequest;
import com.flashcards.flashCards.dto.AddUserResponse;
import com.flashcards.flashCards.dto.GetUserRequest;
import com.flashcards.flashCards.dto.GetUserResponse;
import com.flashcards.flashCards.entity.User;
import com.flashcards.flashCards.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserService {

private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AddUserResponse addUser(AddUserRequest request){
        User user = new User(request.getUserName(), request.getEmail());
        User saved = userRepository.save(user);
        AddUserResponse response = new AddUserResponse();
        response.setId(saved.getId());
        response.setEmail(saved.getEmail());
        return response;
    };

    public GetUserResponse getUser(GetUserRequest request){
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));
        GetUserResponse response = new GetUserResponse();
        response.setId(user.getId());
        response.setUserName(user.getUserName());
        response.setEmail(user.getEmail());
        return response;

    }
}
