package br.com.tech4me.vendas.service;

import java.util.List;
import java.util.Optional;
import br.com.tech4me.vendas.shared.VendaCompletoDto;
import br.com.tech4me.vendas.shared.VendaDto;

public interface VendaService {
    
    List<VendaCompletoDto> obterVenda();
    Optional<VendaDto> obterVendaPorId(String id);
    void excluirVenda(String id);
    VendaCompletoDto CadastrarVenda(VendaCompletoDto vendas);
    Optional<VendaDto> atualizarVendaPorId(String id, VendaDto dto);

}