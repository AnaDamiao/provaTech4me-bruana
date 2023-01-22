package br.com.tech4meroupas.atendimento.utli;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.mongodb.lang.Nullable;

@ControllerAdvice
public class Validacao extends ResponseEntityExceptionHandler {

    @Override
    @Nullable
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        List<String> mensagens = ex.getBindingResult()
                                .getFieldErrors()
                                .stream()
                                .map(e->e.getDefaultMessage())
                                .collect(Collectors.toList());
        return new ResponseEntity<>(mensagens, HttpStatus.NOT_ACCEPTABLE);
    }
    
}
