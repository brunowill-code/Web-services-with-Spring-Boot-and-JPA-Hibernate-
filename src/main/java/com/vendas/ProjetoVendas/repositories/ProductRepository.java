package com.vendas.ProjetoVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.ProjetoVendas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
