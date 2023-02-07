package br.com.tech4me.vendas.shared;


import br.com.tech4me.vendas.model.Atendimento;

public class VendaDto {
    private String nomeCliente;
    private String idRoupa;
    private Atendimento dadosAtendimento;
    private Double valor;
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdRoupa() {
        return idRoupa;
    }
    public void setIdRoupa(String idRoupa) {
        this.idRoupa = idRoupa;
    }
    public Atendimento getDadosAtendimento() {
        return dadosAtendimento;
    }
    public void setDadosAtendimento(Atendimento dadosAtendimento) {
        this.dadosAtendimento = dadosAtendimento;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    

 
    



    
}
