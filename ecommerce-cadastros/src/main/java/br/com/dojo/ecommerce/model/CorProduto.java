package br.com.dojo.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CorProduto {

    @Id
    private Long corProdutoKey;

    private String corDescricao;

    public Long getCorProdutoKey() {
        return corProdutoKey;
    }

    public void setCorProdutoKey(Long corProdutoKey) {
        this.corProdutoKey = corProdutoKey;
    }

    public String getCorDescricao() {
        return corDescricao;
    }

    public void setCorDescricao(String corDescricao) {
        this.corDescricao = corDescricao;
    }
}
