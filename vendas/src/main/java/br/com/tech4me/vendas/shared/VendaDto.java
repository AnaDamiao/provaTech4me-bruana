package br.com.tech4me.vendas.shared;


import br.com.tech4me.vendas.model.Atendimento;

public class VendaDto {
    private String nomeCliente;
    private String idAtendimento;
    private Atendimento dadosAtendimento;
    private Double valor;
    
    
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
