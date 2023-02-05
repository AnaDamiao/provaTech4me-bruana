package br.com.tech4meroupas.atendimento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Atendimento")
public class Atendimento {
    @Id
    private String id;
    private String produto;
    private String tamanho;
    private Double valor;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
