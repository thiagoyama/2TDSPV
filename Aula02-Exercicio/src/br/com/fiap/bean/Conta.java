package br.com.fiap.bean;

import java.util.Calendar;

//Classe abstrata: não pode ser instanciada e pode conter métodos abstratos (sem implementação)
public abstract class Conta {

    private Integer agencia;
    private Integer numero;
    private Calendar dataAbertura; //ALT + ENTER
    private Double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public abstract void retirar(double valor);

    //Construtores
    public Conta() {
    }

    public Conta(Integer agencia, Integer numero, Calendar dataAbertura, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    //Getters e Setters
    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
