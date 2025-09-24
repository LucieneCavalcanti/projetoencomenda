package com.encomendas.projetoencomenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encomendas.projetoencomenda.entities.ProdutoEntity;
import com.encomendas.projetoencomenda.repositories.ProdutoRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

     public ProdutoEntity incluir(ProdutoEntity Produto) {

        return produtoRepository.save(Produto);
    }
    public ProdutoEntity editar(int id, ProdutoEntity Produto) {
        // Verifique se a Produto existe
        Optional<ProdutoEntity> ProdutoExistente = 
        produtoRepository.findById(id);
        
        if (ProdutoExistente.isPresent()) {
            // Atualiza a Produto
            ProdutoEntity ProdutoAtualizada = ProdutoExistente.get();
            ProdutoAtualizada.setDescricao(Produto.getDescricao());  // Atualiza os campos necessários
            return produtoRepository.save(ProdutoAtualizada);  // Salva a Produto atualizada
        } else {
            // Caso a Produto não exista, retorna null
            return null;
        }
    }
    public List<ProdutoEntity> listarTodos() {
        return produtoRepository.findAll();
    }
    public void excluir(Integer id) {
        produtoRepository.deleteById(id);
}
}