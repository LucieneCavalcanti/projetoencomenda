package com.example.encomendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.encomendas.entities.ProdutoEntity;
@Repository
public interface ProdutoRepository extends 
JpaRepository<ProdutoEntity, Integer>{

}
