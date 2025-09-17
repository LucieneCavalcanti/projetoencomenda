package com.example.encomendas.entities;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "itensencomenda")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// ou @Data
public class ItensEncomendaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name="idproduto", nullable = false)//FK
    private ProdutoEntity produto;
    @NonNull
    private Float quantidade;
    @NonNull
    private Float valor;
}
