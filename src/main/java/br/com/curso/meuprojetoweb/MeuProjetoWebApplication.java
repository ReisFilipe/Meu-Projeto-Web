package br.com.curso.meuprojetoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuProjetoWebApplication {

	public static void main(String[] args) {
		System.out.println("Meu primeiro Projeto Java");
		SpringApplication.run(MeuProjetoWebApplication.class, args);
	}

}
