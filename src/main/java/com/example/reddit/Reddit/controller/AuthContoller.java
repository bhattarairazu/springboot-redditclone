package com.example.reddit.Reddit.controller;

import com.example.reddit.Reddit.dto.RegisterRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthContoller {

    @PostMapping("/signup")
    public void signUp(@RequestBody RegisterRequestDto registerRequestDto){

    }
}
