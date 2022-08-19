package com.weslley.cadastro.repositories;

import com.weslley.cadastro.entities.Categoria;
import com.weslley.cadastro.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
