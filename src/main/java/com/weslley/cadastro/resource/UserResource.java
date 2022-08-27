package com.weslley.cadastro.resource;

import com.weslley.cadastro.entities.User;
import com.weslley.cadastro.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> users = userService.findAll();
        return  ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user){
        user = userService.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);
    }

    @DeleteMapping(value = "/{userID}")
    public ResponseEntity<Void> delete(@PathVariable Long userID){
        userService.delete(userID);
        return  ResponseEntity.noContent().build();
    }
    @PutMapping(value = "/{userID}")
    public ResponseEntity<User> update(@PathVariable Long userID, @RequestBody User obj){
        obj = userService.update(userID, obj);
        return ResponseEntity.ok().body(obj);
    }


}
