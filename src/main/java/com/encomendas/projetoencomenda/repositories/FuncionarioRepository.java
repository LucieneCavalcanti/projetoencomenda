package com.encomendas.projetoencomenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encomendas.projetoencomenda.entities.FuncionarioEntity;
@Repository
public interface FuncionarioRepository 
extends JpaRepository <FuncionarioEntity, Integer>{

}
