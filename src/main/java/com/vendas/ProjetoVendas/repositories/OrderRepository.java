package com.vendas.ProjetoVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.ProjetoVendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
