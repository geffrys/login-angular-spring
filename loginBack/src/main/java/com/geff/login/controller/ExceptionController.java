package com.geff.login.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        return e.getMessage();
    }

}
