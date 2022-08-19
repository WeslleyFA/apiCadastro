package com.weslley.cadastro.services;

import com.weslley.cadastro.entities.Produto;

import com.weslley.cadastro.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll(){
        return repository.findAll();
    }

    public Produto findById(Long ProdutoID){
        Optional<Produto> obj = repository.findById(ProdutoID);
        return obj.get();
    }
}
