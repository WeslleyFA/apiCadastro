package com.weslley.cadastro.config;

import com.weslley.cadastro.entities.Pedido;
import com.weslley.cadastro.entities.User;
import com.weslley.cadastro.repositories.PedidoRepository;
import com.weslley.cadastro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public void run(String... args) throws Exception {
        User usuario = new User(null, "Wes", "weslley@", "1111", "12345" );
        User usuario2 = new User(null, "Fabio", "fabio@@", "2222", "dsdsdsd" );


        Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), usuario);
        Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), usuario2);
        Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), usuario);


        userRepository.saveAll(Arrays.asList(usuario,usuario2));
        pedidoRepository.saveAll(Arrays.asList(p1,p2,p3));

    }
}
