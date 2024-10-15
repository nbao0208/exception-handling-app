package com.example.learningexceptionhandling.exception;

import com.example.learningexceptionhandling.model.response.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.UUID;

@RestControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(value = Exception.class)
  public Response<String> handlingException(Exception exception) {
    return Response.<String>builder()
            .id(UUID.randomUUID().toString())
            .message(exception.getMessage())
            .build();
  }
}
