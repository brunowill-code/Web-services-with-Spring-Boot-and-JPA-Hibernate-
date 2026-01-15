package com.vendas.ProjetoVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.ProjetoVendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
