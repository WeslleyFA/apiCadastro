package com.weslley.cadastro.services;

import com.weslley.cadastro.entities.Pedido;
import com.weslley.cadastro.entities.User;
import com.weslley.cadastro.repositories.PedidoRepository;
import com.weslley.cadastro.repositories.UserRepository;
import com.weslley.cadastro.services.exception.ResourceNotFindException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    public List<Pedido> findAll(){
        return repository.findAll();
    }

    public Pedido findById(Long pedidoID){
        Optional<Pedido> obj = repository.findById(pedidoID);
        return obj.orElseThrow(() -> new ResourceNotFindException(pedidoID));
    }
}
