package br.com.dojo.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patinete {

    @Id
    private Long patineteKey;
    private Double alturaPatinete;
    private Double comprimentoPatinete;
    private String Material;
    private Double estoquePatinete;
    private Double rodaPatinete;

    @ManyToOne
    @JoinColumn(name = "PRODUTO_KEY")
    private Produto produto;

    public Long getPatineteKey() {
        return patineteKey;
    }

    public void setPatineteKey(Long patineteKey) {
        this.patineteKey = patineteKey;
    }

    public Double getAlturaPatinete() {
        return alturaPatinete;
    }

    public void setAlturaPatinete(Double alturaPatinete) {
        this.alturaPatinete = alturaPatinete;
    }

    public Double getComprimentoPatinete() {
        return comprimentoPatinete;
    }

    public void setComprimentoPatinete(Double comprimentoPatinete) {
        this.comprimentoPatinete = comprimentoPatinete;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public Double getEstoquePatinete() {
        return estoquePatinete;
    }

    public void setEstoquePatinete(Double estoquePatinete) {
        this.estoquePatinete = estoquePatinete;
    }

    public Double getRodaPatinete() {
        return rodaPatinete;
    }

    public void setRodaPatinete(Double rodaPatinete) {
        this.rodaPatinete = rodaPatinete;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
