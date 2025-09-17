package com.example.encomendas.services;

import org.springframework.stereotype.Service;
import com.example.encomendas.repositories.VendedorRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class VendedorService {
    private VendedorRepository vendedorrepository;
}
