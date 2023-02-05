package br.com.tech4meroupas.atendimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AtendimentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtendimentoApplication.class, args);
	}

}
