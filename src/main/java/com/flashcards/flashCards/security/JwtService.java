package com.flashcards.flashCards.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtService {

    @Value("4842a9d3d85df26bbb029d40a350771e1ff705896e28fa1d22eed73b83ffdf1d84e0e8f3")
    private String jwtSecret;

}
