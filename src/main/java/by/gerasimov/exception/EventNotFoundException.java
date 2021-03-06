package by.gerasimov.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EventNotFoundException extends RuntimeException {

    public <T> EventNotFoundException(Long id) {
        super("Not found event " + id);
    }
}
