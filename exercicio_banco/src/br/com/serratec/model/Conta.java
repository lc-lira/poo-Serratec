package br.com.serratec.model;

public class Conta {
    private Integer numero_conta;
    private String titular;
    private Double saldo;

    public Conta(Integer numero_conta, String titular, Double saldo) {
        this.numero_conta = numero_conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [numero_conta=" + numero_conta + ", titular=" + titular + ", saldo=" + saldo + "]";
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNumero_conta() {
        return numero_conta;
    }

}
