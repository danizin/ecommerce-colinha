package br.com.dojo.ecommerce.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;

public class Imagem {
    @Id
    private Long imagemKey;
    @Lob
    private String aquivo;
    @Enumerated(EnumType.STRING)
    private Extensao extensao;

    public Long getImagemKey() {
        return imagemKey;
    }

    public void setImagemKey(Long imagemKey) {
        this.imagemKey = imagemKey;
    }

    public String getAquivo() {
        return aquivo;
    }

    public void setAquivo(String aquivo) {
        this.aquivo = aquivo;
    }

    public Extensao getExtensao() {
        return extensao;
    }

    public void setExtensao(Extensao extensao) {
        this.extensao = extensao;
    }
}
