package br.com.tech4me.vendas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import br.com.tech4me.vendas.service.VendaService;
import br.com.tech4me.vendas.shared.VendaCompletoDto;
import br.com.tech4me.vendas.shared.VendaDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/vendas")
public class VendasController {

    @Autowired
    private VendaService vender;

    //cadastrando venda
   @PostMapping
   public ResponseEntity <VendaCompletoDto> cadastrarVenda(@RequestBody @Valid VendaCompletoDto venda)
   {

    return new ResponseEntity<>(vender.CadastrarVenda(venda),HttpStatus.CREATED);
   }
   //buscar pedidos
   @GetMapping
   public ResponseEntity<List<VendaCompletoDto>> obtervendas(){
    return new ResponseEntity<>(vender.obterVenda(),HttpStatus.OK);
   }
  
    //Buscar por id
   @GetMapping("/{id}")

   public ResponseEntity<VendaDto> obterVendaPorId(@PathVariable String id)
   {
    Optional<VendaDto> retorno = vender.obterVendaPorId(id);

    if(retorno.isPresent()){
        return new ResponseEntity<>(retorno.get(), HttpStatus.FOUND);

    }else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
   }

   //delet vendas
   @DeleteMapping("/{id}")
   public ResponseEntity<Void> excluirVenda(@PathVariable String id)
   {
    vender.excluirVenda(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   }

   //Atualizar Vendas
   @PutMapping("/{id}")
   public ResponseEntity<VendaDto> atualizarVenda(@PathVariable String id, @Valid VendaDto venda)
   {
    Optional<VendaDto> retorne = vender.atualizarVendaPorId(id, venda);

    if(retorne.isPresent()){
        return new ResponseEntity<>(retorne.get(),HttpStatus.ACCEPTED);
    }else{
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }
   }

}
