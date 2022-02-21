package me.dio.ecrossbank.model;

import java.math.BigDecimal;

public class Conta {

    private String numeroCartao;
    private BigDecimal saldo = new BigDecimal("0.00");
    private String numeroString;


    public Conta() {
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroTeste){
        numeroString = Integer.toString(numeroTeste);
        this.numeroCartao = numeroString;

    }
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void depositar (float valor){
        BigDecimal value = new BigDecimal(valor);
        this.setSaldo(this.getSaldo().add(value));
    }

    public boolean sacar (float valor) {
        BigDecimal value = new BigDecimal(valor);
        if(this.getSaldo().compareTo(value) == 0 || this.getSaldo().compareTo(value) == 1){
            this.setSaldo(this.getSaldo().subtract(value));
            return true;
        }
        return false;



    }

    @Override
    public String toString() {
        return "me.dio.ecrossbank.model.Conta" + '\n' +
                "numero= " + numeroCartao + '\n';

    }

}
