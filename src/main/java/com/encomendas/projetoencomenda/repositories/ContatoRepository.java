package com.encomendas.projetoencomenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encomendas.projetoencomenda.entities.ContatoEntity;
@Repository
public interface ContatoRepository 
extends JpaRepository <ContatoEntity, Integer>{

}
