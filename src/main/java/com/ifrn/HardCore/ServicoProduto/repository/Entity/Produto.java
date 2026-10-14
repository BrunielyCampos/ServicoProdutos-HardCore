package com.ifrn.HardCore.ServicoProduto.repository.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity 
@Table(name = "produto")
@Data
@NoArgsConstructor 
@AllArgsConstructor 
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank 
    private String nomeProduto;

    @NonNull 
    private Double preco;

    private String categoria;

    private String marca;

    @OneToMany
    @JoinColumn(name = "id_estoque")
    private Estoque estoqueList;

    //(cascade = CascadeType.ALL) -> decidir como usar
    @OneToMany(mappedBy = "produto", cascade = CascadeType.PERSIST)
    private List<Avaliacao> avaliacoesList;


}
