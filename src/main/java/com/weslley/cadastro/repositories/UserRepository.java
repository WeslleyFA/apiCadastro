package com.weslley.cadastro.repositories;

import com.weslley.cadastro.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    private User userByNome(String nome) {
        return null;
    }
}
