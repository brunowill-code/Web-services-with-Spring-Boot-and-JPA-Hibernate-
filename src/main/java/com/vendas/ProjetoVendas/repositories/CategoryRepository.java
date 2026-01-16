package com.vendas.ProjetoVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.ProjetoVendas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
