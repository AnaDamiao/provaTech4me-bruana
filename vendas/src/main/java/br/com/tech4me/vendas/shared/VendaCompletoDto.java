package br.com.tech4me.vendas.shared;

import jakarta.validation.constraints.Positive;

public class VendaCompletoDto {
        private String id;
        private String nomeCliente;
        private String produto;
        @Positive
        private Double quantidade;



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
        public String getProduto() {
            return produto;
        }
        public void setProduto(String produto) {
            this.produto = produto;
        }
        public Double getQuantidade() {
            return quantidade;
        }
        public void setQuantidade(Double quantidade) {
            this.quantidade = quantidade;
        }
 
        
}
