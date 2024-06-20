package br.com.udemy.userapi;

import br.com.udemy.userapi.domain.User;
import br.com.udemy.userapi.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;


@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public UserApiApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(List.of(
                new User(null, "Nome usuario", "email@email.com", "123456", new BigDecimal(30))
        ));
    }
}
