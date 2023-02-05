package br.com.tech4me.vendas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4me.vendas.model.Venda;

public interface VendaRepository extends MongoRepository<Venda,String>{
    
}

