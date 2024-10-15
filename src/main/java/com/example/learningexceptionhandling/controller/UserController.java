package com.example.learningexceptionhandling.controller;

import com.example.learningexceptionhandling.model.request.GetUserRequest;
import com.example.learningexceptionhandling.model.response.GetUserResponse;
import com.example.learningexceptionhandling.model.response.Response;
import com.example.learningexceptionhandling.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  public Response<GetUserResponse> getUser(@RequestBody GetUserRequest request) {
    return userService.getUser(request);
  }
}
