package br.com.tech4meroupas.atendimento.repositorio;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4meroupas.atendimento.model.Atendimento;


public interface Repositorio extends MongoRepository<Atendimento,String> {
    
} 
