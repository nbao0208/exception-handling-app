package com.example.learningexceptionhandling.dto;

import com.example.learningexceptionhandling.model.request.GetUserRequest;
import com.example.learningexceptionhandling.model.response.GetUserResponse;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDto {
  GetUserResponse getUser(GetUserRequest request);
}
