package com.example.encomendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.encomendas.entities.FuncionarioEntity;

@Repository
public interface FuncionarioRepository 
extends JpaRepository<FuncionarioEntity,
 Integer>{

}
