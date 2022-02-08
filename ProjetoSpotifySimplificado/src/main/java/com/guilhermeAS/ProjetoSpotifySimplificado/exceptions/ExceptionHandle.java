package com.guilhermeAS.ProjetoSpotifySimplificado.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {
        @ExceptionHandler
        public ResponseEntity<ErroObject> handleException(RuntimeException ex){
            ErroObject eObject = new ErroObject(HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());

            return new ResponseEntity<ErroObject>(eObject, HttpStatus.NOT_FOUND);
        }

}
