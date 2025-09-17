package com.example.encomendas.services;

import org.springframework.stereotype.Service;
import com.example.encomendas.repositories.FuncionarioRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class FuncionarioService {
    private FuncionarioRepository funcionariorepository;
}
