package com.encomendas.projetoencomenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encomendas.projetoencomenda.entities.EncomendaEntity;
import com.encomendas.projetoencomenda.repositories.EncomendaRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class EncomendaService {
    private final EncomendaRepository EncomendaRepository;

     public EncomendaEntity incluir(EncomendaEntity Encomenda) {

        return EncomendaRepository.save(Encomenda);
    }
    public EncomendaEntity editar(int id, EncomendaEntity Encomenda) {
        // Verifique se a Encomenda existe
        Optional<EncomendaEntity> EncomendaExistente = 
        EncomendaRepository.findById(id);
        
        if (EncomendaExistente.isPresent()) {
            // Atualiza a Encomenda
            EncomendaEntity EncomendaAtualizada = EncomendaExistente.get();
            //EncomendaAtualizada.setDescricao(Encomenda.getDescricao());  // Atualiza os campos necessários
            return EncomendaRepository.save(EncomendaAtualizada);  // Salva a Encomenda atualizada
        } else {
            // Caso a Encomenda não exista, retorna null
            return null;
        }
    }
    public List<EncomendaEntity> listarTodos() {
        return EncomendaRepository.findAll();
    }
    public void excluir(Integer id) {
        EncomendaRepository.deleteById(id);
}
}