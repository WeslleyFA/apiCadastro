package com.weslley.cadastro.services;

import com.weslley.cadastro.entities.User;
import com.weslley.cadastro.repositories.UserRepository;
import com.weslley.cadastro.services.exception.DataBaseException;
import com.weslley.cadastro.services.exception.ResourceNotFindException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        return obj.orElseThrow(() -> new ResourceNotFindException(userID));
    }

    public User insert(User user){
        return  repository.save(user);
    }

    public void delete(Long userID){
        try{
            repository.deleteById(userID);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFindException(userID);
        }catch (DataIntegrityViolationException e){
            throw new DataBaseException(e.getMessage());
        }
    }

    public User update(Long id, User novoUser){
        User user = repository.getOne(id);
        updateUser(user,novoUser);
        return repository.save(user);

    }

    private void updateUser(User user, User userAtualizado) {
        user.setCelular(userAtualizado.getCelular());
        user.setEmail(userAtualizado.getEmail());
        user.setNome(userAtualizado.getNome());
    }
}
