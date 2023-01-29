package br.com.tech4meroupas.atendimento.service;

import java.util.List;
import java.util.Optional;
import br.com.tech4meroupas.atendimento.shared.AtendimentoCompletoDto;
import br.com.tech4meroupas.atendimento.shared.AtendimentoDto;

public interface AtendimentoService {
    
    List<AtendimentoCompletoDto> obterTodosAtendimentos();
    Optional<AtendimentoDto> obterAtendimentoPorId(String id);
    void exculirAtendimentoPorId (String id);
    AtendimentoCompletoDto cadastrarAtendimento(AtendimentoCompletoDto atendimento);
    Optional <AtendimentoCompletoDto> atualizarAtendimentoPorId (String id,AtendimentoCompletoDto atendimento);
    
}
