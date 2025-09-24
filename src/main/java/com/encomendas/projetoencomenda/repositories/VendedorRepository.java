package com.encomendas.projetoencomenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encomendas.projetoencomenda.entities.VendedorEntity;
@Repository
public interface VendedorRepository 
extends JpaRepository <VendedorEntity, Integer>{

}
