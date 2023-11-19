package br.com.curso.meuprojetoweb.controller;

import br.com.curso.meuprojetoweb.entity.Salarios;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
public class GeradorDeSalarios {

    public BigDecimal salarioProgramador() {
        Salarios salarioProgramador = new Salarios();
        salarioProgramador.setMeuSalarioProgramador(new BigDecimal("10.00"));

        return  salarioProgramador.getMeuSalarioProgramador();
    }

    public Salarios todosSalarios() {
        Salarios salarios = new Salarios(new BigDecimal("10.00"), new BigDecimal("20.00"));

        return  salarios;
    }
}
