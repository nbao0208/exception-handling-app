package com.example.learningexceptionhandling.service.impl;

import com.example.learningexceptionhandling.dto.UserDto;
import com.example.learningexceptionhandling.model.request.GetUserRequest;
import com.example.learningexceptionhandling.model.response.GetUserResponse;
import com.example.learningexceptionhandling.model.response.Response;
import com.example.learningexceptionhandling.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
  private final UserDto userDto;

  @Override
  public Response<GetUserResponse> getUser(GetUserRequest getUserRequest) {
    return Response.<GetUserResponse>builder()
            .id(UUID.randomUUID().toString())
            .status("OK")
            .data(userDto.getUser(getUserRequest))
            .build();
  }
}
