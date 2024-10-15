package com.example.learningexceptionhandling.dto.impl;

import com.example.learningexceptionhandling.dao.UserDao;
import com.example.learningexceptionhandling.dto.UserDto;
import com.example.learningexceptionhandling.model.request.GetUserRequest;
import com.example.learningexceptionhandling.model.response.GetUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDtoImpl implements UserDto {
  private final UserDao userDao;
  @Override
  public GetUserResponse getUser(GetUserRequest request) {
    return GetUserResponse.builder()
            .name(userDao.getUser(request.getId()))
            .build();
  }
}
