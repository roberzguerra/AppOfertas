package br.com.trinopolo.appofertas;

import java.math.BigDecimal;

/**
 * Created by guerra on 07/07/17.
 */

public class Oferta {

    Integer id;
    String nome;
    BigDecimal valor;
    BigDecimal valorDesconto;
    BigDecimal valorEntrada;
    Integer qtdCondicoes;

    public Oferta(Integer id, String nome, BigDecimal valor, BigDecimal valorDesconto, BigDecimal valorEntrada, Integer qtdCondicoes) {

        this.setId(id);
        this.setNome(nome);
        this.setValor(valor);
        this.setValorDesconto(valorDesconto);
        this.setValorEntrada(valorEntrada);
        this.setQtdCondicoes(qtdCondicoes);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(BigDecimal valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Integer getQtdCondicoes() {
        return qtdCondicoes;
    }

    public void setQtdCondicoes(Integer qtdCondicoes) {
        this.qtdCondicoes = qtdCondicoes;
    }
}
