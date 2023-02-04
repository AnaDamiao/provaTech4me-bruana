package br.com.tech4me.vendas.model;

import org.springframework.data.annotation.Id;

public class Atendimento {
    
    @Id
    private String produto;
    private Double valor;
    
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }


}