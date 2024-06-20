package br.com.udemy.userapi.resources.impl;

import br.com.udemy.userapi.domain.User;
import br.com.udemy.userapi.resources.UserResource;
import br.com.udemy.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource {

    private final UserService userService;

    @Override
    @RequestMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }
}
