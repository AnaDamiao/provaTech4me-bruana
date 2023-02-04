package br.com.tech4me.vendas.model;

import org.springframework.data.annotation.Id;

public class Venda {
    @Id
    private String id;
    private String nomeCliente;
    private String idAtendimento;
    private Double valor;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdAtendimento() {
        return idAtendimento;
    }
    public void setIdAtendimento(String idAtendimento) {
        this.idAtendimento = idAtendimento;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

   
}
