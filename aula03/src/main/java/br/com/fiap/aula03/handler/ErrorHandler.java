package br.com.fiap.aula03.handler;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Tratar as exceptions mapeadas pelos métodos
@RestControllerAdvice
public class ErrorHandler {

    //Implementar o método para tratar o EntityNotFoundException
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Void> error404(){
        return ResponseEntity.notFound().build();
    }

}
