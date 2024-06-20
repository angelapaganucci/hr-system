package br.com.udemy.userapi.services;

import br.com.udemy.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
