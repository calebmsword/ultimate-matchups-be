package com.example.exceptions.handler;

import com.example.exceptions.MatchupChartNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = MatchupChartNotFoundException.class)
    public ResponseEntity<ErrorMessage> MatchupChartExceptionHandler(MatchupChartNotFoundException matchupChartNotFoundException) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        String message = matchupChartNotFoundException.getMessage();
        ErrorMessage errorMessage = new ErrorMessage(status, message);
        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
    }
}
