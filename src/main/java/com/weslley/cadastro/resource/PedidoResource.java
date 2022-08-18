package com.weslley.cadastro.resource;

import com.weslley.cadastro.entities.Pedido;
import com.weslley.cadastro.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
    @Autowired
    private PedidoService PedidoService;

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll(){
        List<Pedido> Pedidos = PedidoService.findAll();
        return  ResponseEntity.ok().body(Pedidos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Long id){
        Pedido Pedido = PedidoService.findById(id);
        return ResponseEntity.ok().body(Pedido);
    }
}
