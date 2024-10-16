package com.example.learningexceptionhandling.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response <T>{
  private String id;
  private String message;
  private String status;
  private T data;
}
