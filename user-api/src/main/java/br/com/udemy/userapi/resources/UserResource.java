package br.com.udemy.userapi.resources;

import br.com.udemy.userapi.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface UserResource {

    @GetMapping(value = "/{id}")
    ResponseEntity<User> findById(Long id);

    @GetMapping
    ResponseEntity<List<User>> findAll();
}
