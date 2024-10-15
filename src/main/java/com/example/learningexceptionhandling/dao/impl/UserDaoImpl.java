package com.example.learningexceptionhandling.dao.impl;

import com.example.learningexceptionhandling.dao.UserDao;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
  @Override
  public String getUser(Long id) {
    if (id < 0) {
      throw new UsernameNotFoundException("Invalid Id");
    }
    return "Have gotten the user";
  }
}
