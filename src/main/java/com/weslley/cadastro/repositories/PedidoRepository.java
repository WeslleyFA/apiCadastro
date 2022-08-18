package com.weslley.cadastro.repositories;

import com.weslley.cadastro.entities.Pedido;
import com.weslley.cadastro.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
