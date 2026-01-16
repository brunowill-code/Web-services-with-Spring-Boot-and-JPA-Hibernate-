package com.vendas.ProjetoVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.ProjetoVendas.entities.OrderItem;
import com.vendas.ProjetoVendas.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
