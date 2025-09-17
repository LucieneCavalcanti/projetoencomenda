package com.example.encomendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.encomendas.entities.VendedorEntity;
@Repository
public interface VendedorRepository 
extends JpaRepository<VendedorEntity,Integer>{

}
