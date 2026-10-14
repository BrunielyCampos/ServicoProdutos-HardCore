package com.ifrn.HardCore.ServicoProduto.repository.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "estoque")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int qtdDisponivel;
    private int qtdDisponivelPrateleira;


    @OneToMany
    @JoinColumn(name = "id_produto", referencedColumnName = "id")
    private List<Produto> produtoList;

}
