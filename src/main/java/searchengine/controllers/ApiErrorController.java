package searchengine.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import searchengine.exception.ErrMessage;

@RestControllerAdvice
public class ApiErrorController {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErrMessage> nullPointerException(NullPointerException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ErrMessage("Search info is not in database"
                        + exception.getMessage()));
    }

}
