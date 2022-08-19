package com.weslley.cadastro.services;

import com.weslley.cadastro.entities.Categoria;

import com.weslley.cadastro.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> findAll(){
        return repository.findAll();
    }

    public Categoria findById(Long CategoriaID){
        Optional<Categoria> obj = repository.findById(CategoriaID);
        return obj.get();
    }
}
