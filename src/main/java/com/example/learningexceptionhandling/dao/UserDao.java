package com.example.learningexceptionhandling.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
  String getUser(Long id);
}
