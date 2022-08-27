package com.weslley.cadastro.services;

import com.weslley.cadastro.entities.Produto;

import com.weslley.cadastro.repositories.ProdutoRepository;
import com.weslley.cadastro.services.exception.ResourceNotFindException;
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

    public Produto findById(Long produtoID){
        Optional<Produto> obj = repository.findById(produtoID);
        return obj.orElseThrow(() -> new ResourceNotFindException(produtoID));
    }
}
