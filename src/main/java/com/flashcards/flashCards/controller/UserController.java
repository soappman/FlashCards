package com.flashcards.flashCards.controller;

import com.flashcards.flashCards.dto.AddUserRequest;
import com.flashcards.flashCards.dto.AddUserResponse;
import com.flashcards.flashCards.dto.GetUserRequest;
import com.flashcards.flashCards.dto.GetUserResponse;
import com.flashcards.flashCards.entity.User;
import com.flashcards.flashCards.repository.UserRepository;
import com.flashcards.flashCards.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public AddUserResponse addUser(@RequestBody AddUserRequest request) {
        return userService.addUser(request);
    }

    @GetMapping("/get_user")
    public GetUserResponse getUser(@RequestBody GetUserRequest request) {
        return userService.getUser(request);
    }

}

