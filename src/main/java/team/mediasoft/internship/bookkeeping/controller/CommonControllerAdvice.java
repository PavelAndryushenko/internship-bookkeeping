package team.mediasoft.internship.bookkeeping.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import team.mediasoft.internship.bookkeeping.dto.ResponseDto;
import team.mediasoft.internship.bookkeeping.exception.EntityNotFoundException;
import team.mediasoft.internship.bookkeeping.factory.ResponseFactory;

@RestControllerAdvice
public class CommonControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseDto<Void> notValidRequest(IllegalArgumentException e) {
        return ResponseFactory.createFailedResponse(HttpStatus.BAD_REQUEST, e.getMessage());
    }

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseDto<Void> notFoundRequest(EntityNotFoundException e) {
        return ResponseFactory.createFailedResponse(HttpStatus.NOT_FOUND, e.getMessage());
    }

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseDto<Void> handleException(Throwable e) {
        return ResponseFactory.createFailedResponse(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
    }
}
