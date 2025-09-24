package com.encomendas.projetoencomenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encomendas.projetoencomenda.entities.VendedorEntity;
import com.encomendas.projetoencomenda.repositories.VendedorRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class VendedorService {
    private final VendedorRepository VendedorRepository;

     public VendedorEntity incluir(VendedorEntity Vendedor) {

        return VendedorRepository.save(Vendedor);
    }
    public VendedorEntity editar(int id, VendedorEntity Vendedor) {
        // Verifique se a Vendedor existe
        Optional<VendedorEntity> VendedorExistente = 
        VendedorRepository.findById(id);
        
        if (VendedorExistente.isPresent()) {
            // Atualiza a Vendedor
            VendedorEntity VendedorAtualizada = VendedorExistente.get();
            //VendedorAtualizada.setDescricao(Vendedor.getDescricao());  // Atualiza os campos necessários
            return VendedorRepository.save(VendedorAtualizada);  // Salva a Vendedor atualizada
        } else {
            // Caso a Vendedor não exista, retorna null
            return null;
        }
    }
    public List<VendedorEntity> listarTodos() {
        return VendedorRepository.findAll();
    }
    public void excluir(Integer id) {
        VendedorRepository.deleteById(id);
}
}