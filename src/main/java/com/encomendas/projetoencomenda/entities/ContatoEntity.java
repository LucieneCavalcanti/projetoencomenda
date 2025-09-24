package com.encomendas.projetoencomenda.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor //construtor nulo ou vazio
@Entity
@Table(name="contatos")
public class ContatoEntity {
    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private int id;
    @Column(length = 20)
    @NonNull
    private String tipo;
    @Column(nullable = false, length = 120)
    private String descricao;
}
