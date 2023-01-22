package br.com.tech4meroupas.atendimento.service;

public interface AtendimentoService {
    
    List<AtendimentoCompletoDto> obterTodosAtendimentos();
    Optional<AtendimentoDto> obterAtendimentoPorId(String id);
    void exculirAtendimentoPorId (String id);
    PizzaCompletoDto cadastrarAtendimento(AtendimentoCompletoDto atendimento);
    Optional <AtendimentoCompletoDto> atualizarAtendimentoPorId (String id,AtendimentoCompletoDto atendimento);
    
}
