package br.com.udemy.userapi.services.impl;

import br.com.udemy.userapi.domain.User;
import br.com.udemy.userapi.repositories.UserRepository;
import br.com.udemy.userapi.services.UserService;
import br.com.udemy.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private static final String OBJECT_NOT_FOUND = "Object not found";

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(OBJECT_NOT_FOUND));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
