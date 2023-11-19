package br.com.curso.meuprojetoweb.entity;

import java.math.BigDecimal;

public class Salarios {

    private BigDecimal meuSalarioProgramador = BigDecimal.ZERO;
    private BigDecimal meuSalarioStreamer = BigDecimal.ZERO;

    public Salarios() {

    }

    public Salarios(BigDecimal meuSalarioProgramador) {
        this.meuSalarioProgramador = meuSalarioProgramador;
    }

    public Salarios(BigDecimal meuSalarioProgramador, BigDecimal meuSalarioStreamer) {
        this.meuSalarioProgramador = meuSalarioProgramador;
        this.meuSalarioStreamer = meuSalarioStreamer;
    }

    public BigDecimal getMeuSalarioProgramador() {
        return meuSalarioProgramador;
    }

    public void setMeuSalarioProgramador(BigDecimal meuSalarioProgramador) {
        this.meuSalarioProgramador = meuSalarioProgramador;
    }

    public BigDecimal getMeuSalarioStreamer() {
        return meuSalarioStreamer;
    }

    public void setMeuSalarioStreamer(BigDecimal meuSalarioStreamer) {
        this.meuSalarioStreamer = meuSalarioStreamer;
    }

    @Override
    public String toString() {
        return "Salarios{" +
                "meuSalarioProgramador=" + meuSalarioProgramador +
                ", meuSalarioStreamer=" + meuSalarioStreamer +
                '}';
    }
}
