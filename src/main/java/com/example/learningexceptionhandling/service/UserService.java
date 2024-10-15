package com.example.learningexceptionhandling.service;

import com.example.learningexceptionhandling.model.request.GetUserRequest;
import com.example.learningexceptionhandling.model.response.GetUserResponse;
import com.example.learningexceptionhandling.model.response.Response;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
  Response<GetUserResponse> getUser(GetUserRequest getUserRequest);
}
