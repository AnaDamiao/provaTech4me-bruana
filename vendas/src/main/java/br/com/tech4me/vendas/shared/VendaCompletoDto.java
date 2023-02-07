package br.com.tech4me.vendas.shared;

import jakarta.validation.constraints.Positive;

public class VendaCompletoDto {
        private String id;
        private String nomeCliente;
        private String idRoupa;
        @Positive
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
        public String getIdRoupa() {
            return idRoupa;
        }
        public void setIdRoupa(String idRoupa) {
            this.idRoupa = idRoupa;
        }
        public Double getValor() {
            return valor;
        }
        public void setValor(Double valor) {
            this.valor = valor;
        }

}
