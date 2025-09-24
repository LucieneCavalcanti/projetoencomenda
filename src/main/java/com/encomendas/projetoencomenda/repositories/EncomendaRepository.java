package com.encomendas.projetoencomenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encomendas.projetoencomenda.entities.EncomendaEntity;
@Repository
public interface EncomendaRepository 
extends JpaRepository <EncomendaEntity, Integer>{

}
