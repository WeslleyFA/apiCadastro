package com.weslley.cadastro.services;

import com.weslley.cadastro.entities.User;
import com.weslley.cadastro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long userID){
        Optional<User> obj = repository.findById(userID);
        return obj.get();
    }
}
