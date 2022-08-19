package com.weslley.cadastro.repositories;

import com.weslley.cadastro.entities.Categoria;
import com.weslley.cadastro.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
