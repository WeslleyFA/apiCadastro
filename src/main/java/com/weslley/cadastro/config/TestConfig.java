package com.weslley.cadastro.config;

import com.weslley.cadastro.entities.User;
import com.weslley.cadastro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User usuario = new User(null, "Wes", "weslley@", "1111", "12345" );
        User usuario2 = new User(null, "Fabio", "fabio@@", "2222", "dsdsdsd" );

       userRepository.saveAll(Arrays.asList(usuario,usuario2));
    }
}
