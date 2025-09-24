package com.encomendas.projetoencomenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encomendas.projetoencomenda.entities.FuncionarioEntity;
import com.encomendas.projetoencomenda.repositories.FuncionarioRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class FuncionarioService {
    private final FuncionarioRepository FuncionarioRepository;

     public FuncionarioEntity incluir(FuncionarioEntity Funcionario) {

        return FuncionarioRepository.save(Funcionario);
    }
    public FuncionarioEntity editar(int id, FuncionarioEntity Funcionario) {
        // Verifique se a Funcionario existe
        Optional<FuncionarioEntity> FuncionarioExistente = 
        FuncionarioRepository.findById(id);
        
        if (FuncionarioExistente.isPresent()) {
            // Atualiza a Funcionario
            FuncionarioEntity FuncionarioAtualizada = FuncionarioExistente.get();
            //FuncionarioAtualizada.setDescricao(Funcionario.getDescricao());  // Atualiza os campos necessários
            return FuncionarioRepository.save(FuncionarioAtualizada);  // Salva a Funcionario atualizada
        } else {
            // Caso a Funcionario não exista, retorna null
            return null;
        }
    }
    public List<FuncionarioEntity> listarTodos() {
        return FuncionarioRepository.findAll();
    }
    public void excluir(Integer id) {
        FuncionarioRepository.deleteById(id);
}
}