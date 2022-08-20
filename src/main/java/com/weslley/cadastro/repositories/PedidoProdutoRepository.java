package com.weslley.cadastro.repositories;

import com.weslley.cadastro.entities.Categoria;
import com.weslley.cadastro.entities.PedidoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoProdutoRepository extends JpaRepository<PedidoProduto, Long> {
}
