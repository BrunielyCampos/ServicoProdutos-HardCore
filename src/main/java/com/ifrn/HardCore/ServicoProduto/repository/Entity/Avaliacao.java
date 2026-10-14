package com.ifrn.HardCore.ServicoProduto.repository.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "avaliacao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String avaliacaoProduto;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

}
