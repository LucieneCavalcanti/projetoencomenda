package com.encomendas.projetoencomenda.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import com.encomendas.projetoencomenda.entities.VendedorEntity;
import com.encomendas.projetoencomenda.services.VendedorService;
@RestController
@RequiredArgsConstructor //colocando isso não precisa colocar @Autowired no atributo
@RequestMapping(value = "/vendedor")
public class VendedorController {
    private final VendedorService VendedorService;

    @GetMapping
    public ResponseEntity<List<VendedorEntity>> listarTodos() {
        List<VendedorEntity> lista = VendedorService.listarTodos();
        return ResponseEntity.ok().body(lista);
    }

    @PostMapping
    public ResponseEntity<VendedorEntity> incluir(@RequestBody 
    VendedorEntity Vendedor) {
        VendedorEntity novo = VendedorService.incluir(Vendedor);
        if (novo != null) {
            return new ResponseEntity<>(novo, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

     @PutMapping("/{id}")
    public ResponseEntity<VendedorEntity> editar(@PathVariable int id, 
    @RequestBody VendedorEntity Vendedor) {
        VendedorEntity atualizado = VendedorService.editar(id,Vendedor);
        if (atualizado != null) {
            return new ResponseEntity<>(atualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable int id) {
        VendedorService.excluir(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
