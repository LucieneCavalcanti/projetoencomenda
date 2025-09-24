package com.encomendas.projetoencomenda.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.encomendas.projetoencomenda.entities.ContatoEntity;
import com.encomendas.projetoencomenda.repositories.ContatoRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ContatoService {
    private final ContatoRepository ContatoRepository;

     public ContatoEntity incluir(ContatoEntity Contato) {

        return ContatoRepository.save(Contato);
    }
    public ContatoEntity editar(int id, ContatoEntity Contato) {
        // Verifique se a Contato existe
        Optional<ContatoEntity> ContatoExistente = 
        ContatoRepository.findById(id);
        
        if (ContatoExistente.isPresent()) {
            // Atualiza a Contato
            ContatoEntity ContatoAtualizada = ContatoExistente.get();
            //ContatoAtualizada.setDescricao(Contato.getDescricao());  // Atualiza os campos necessários
            return ContatoRepository.save(ContatoAtualizada);  // Salva a Contato atualizada
        } else {
            // Caso a Contato não exista, retorna null
            return null;
        }
    }
    public List<ContatoEntity> listarTodos() {
        return ContatoRepository.findAll();
    }
    public void excluir(Integer id) {
        ContatoRepository.deleteById(id);
}
}