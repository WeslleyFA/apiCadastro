package com.weslley.cadastro.config;

import com.weslley.cadastro.entities.Categoria;
import com.weslley.cadastro.entities.Pedido;
import com.weslley.cadastro.entities.Produto;
import com.weslley.cadastro.entities.User;
import com.weslley.cadastro.repositories.CategoriaRepository;
import com.weslley.cadastro.repositories.PedidoRepository;
import com.weslley.cadastro.repositories.ProdutoRepository;
import com.weslley.cadastro.repositories.UserRepository;
import com.weslley.cadastro.entities.enums.StatusPedido;
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

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria(null, "Electronics");
        Categoria cat2 = new Categoria(null, "Books");
        Categoria cat3 = new Categoria(null, "Computers");

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));


        User usuario = new User(null, "Weslley", "weslley@", "1111", "12345" );
        User usuario2 = new User(null, "Fabio", "fabio@@", "2222", "dsdsdsd" );


        Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), usuario, StatusPedido.PAGO);
        Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), usuario2, StatusPedido.ENVIADO);
        Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), usuario,StatusPedido.ENVIADO);

        Produto pr1 = new Produto(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Produto pr2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Produto pr3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Produto pr4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");


        pr1.getCategorias().add(cat2);
        pr2.getCategorias().add(cat1);
        pr3.getCategorias().add(cat3);
        pr4.getCategorias().add(cat3);


        userRepository.saveAll(Arrays.asList(usuario,usuario2));
        pedidoRepository.saveAll(Arrays.asList(p1,p2,p3));

        produtoRepository.saveAll(Arrays.asList(pr1,pr2,pr3,pr4));

    }
}
