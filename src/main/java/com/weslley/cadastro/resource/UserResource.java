package com.weslley.cadastro.resource;

import com.weslley.cadastro.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User usuario = new User(1L, "nome", "weslley@", "1111", "12345" );
        return  ResponseEntity.ok().body(usuario);
    }
}
