package br.com.tech4meroupas.atendimento.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.tech4meroupas.atendimento.service.AtendimentoService;
import br.com.tech4meroupas.atendimento.shared.AtendimentoCompletoDto;
import br.com.tech4meroupas.atendimento.shared.AtendimentoDto;
import jakarta.validation.Valid;


@RestController
@RequestMapping ("/loja")
public class Controler {
    @Autowired
    private AtendimentoService servico;

    @PostMapping
    public ResponseEntity <AtendimentoCompletoDto>cadastrarAtendimento(@RequestBody @Valid AtendimentoCompletoDto atendimento){
        return new ResponseEntity<>(servico.cadastrarAtendimento(atendimento),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AtendimentoCompletoDto>> obterCardapio() {
      return new ResponseEntity<>(servico.obterTodosAtendimentos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AtendimentoDto>obterAtendimentoPorId(@PathVariable String id){
        Optional <AtendimentoDto>retorno =servico.obterAtendimentoPorId(id);


        if (retorno.isPresent()){
            return new ResponseEntity<>(retorno.get(),HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);  
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity <AtendimentoCompletoDto>atualizarAtendimento(@PathVariable String id,@RequestBody AtendimentoCompletoDto atendimento){
        Optional <AtendimentoCompletoDto> retorno = servico.atualizarAtendimentoPorId(id, atendimento);

        if(retorno.isPresent()){
            return new ResponseEntity<>(retorno.get(),HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
    

    @GetMapping("/porta")
      public String obterPorta (@Value("${local.server.port}") String porta){
         return "a instancia que respondeu a retribuição está rodando na porta "+ porta;
      }


      @DeleteMapping("/{id}")
      public ResponseEntity<Void> excluirAtendimento (@PathVariable String id  ){
          servico.exculirAtendimentoPorId(id);
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

    
    }
    
