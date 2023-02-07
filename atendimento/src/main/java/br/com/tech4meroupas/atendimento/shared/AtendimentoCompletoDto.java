package br.com.tech4meroupas.atendimento.shared;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class AtendimentoCompletoDto {
    private String id;
    @NotEmpty(message="Este Campo não pode estar em branco")
    @NotBlank(message="Por Favor, Informe os caracteres")
    private String produto;
    @Size(min=1,max =2,message = "infirme pp,p,m,g ou gg")
    private String tamanho;
    @Positive(message="valor deve ser informado")
    private double valor;
    
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
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
