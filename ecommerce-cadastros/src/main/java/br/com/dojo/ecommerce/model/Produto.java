package br.com.dojo.ecommerce.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    private Long produtoKey;
    private String caracteristicas;
    private String descricao;
    private BigDecimal preco;
    private boolean situacao;

    @Enumerated(EnumType.STRING)
    private TipoProduto tipoProduto;

//    @OneToMany(mappedBy = "corProdutoKey")
//    private CorProduto corProduto;


}
