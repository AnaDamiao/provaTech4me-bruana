package br.com.tech4me.vendas.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.tech4me.vendas.model.Atendimento;

@FeignClient("atendimento")
public interface AtendimentoClient {
    @RequestMapping(method = RequestMethod.GET, value="/loja/{id}")
    Atendimento obterAtendimento(@PathVariable String id);
}
