package br.com.tech4meroupas.atendimento.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.tech4meroupas.atendimento.model.Atendimento;
import br.com.tech4meroupas.atendimento.repositorio.Repositorio;
import br.com.tech4meroupas.atendimento.shared.AtendimentoCompletoDto;
import br.com.tech4meroupas.atendimento.shared.AtendimentoDto;


public class AtendimentoServiceImpl implements AtendimentoService {


    @Autowired
    private Repositorio repositorio;

    @Override
    public List<AtendimentoCompletoDto> obterTodosAtendimentos() {
        List<Atendimento>pizzas=repositorio.findAll();
        return pizzas.stream()
        .map(p->new ModelMapper().map(p,AtendimentoCompletoDto.class))
        .collect(Collectors.toList());
    }

    @Override
    public Optional<AtendimentoDto> obterAtendimentoPorId(String id) {
        Optional<Atendimento>atendimento = repositorio.findById(id);

        if(atendimento.isPresent()){
            return Optional.of(new ModelMapper().map(atendimento.get(),AtendimentoDto.class));
        }
        return Optional.empty();
    }

    @Override
    public void exculirAtendimentoPorId(String id) {
        repositorio.deleteById(id);
    }

    @Override
    public AtendimentoCompletoDto cadastrarAtendimento(AtendimentoCompletoDto atendimento) {
        Atendimento atendimentos =new ModelMapper().map(atendimento,Atendimento.class);
        repositorio.save(atendimentos);
        return new ModelMapper().map(atendimento,AtendimentoCompletoDto.class);
    }

    @Override
    public Optional<AtendimentoCompletoDto> atualizarAtendimentoPorId(String id, AtendimentoCompletoDto dto) {
        Optional<Atendimento> retorno = repositorio.findById(id);
        
        if (retorno.isPresent()){
            Atendimento atendimento =new ModelMapper().map(dto,Atendimento.class);
            atendimento.setId(id);
            repositorio.save(atendimento);
            return Optional.of(new ModelMapper().map(atendimento, AtendimentoCompletoDto.class));
        }else{
            return Optional.empty();
        }
    }
    
}
