import java.math.BigDecimal;

public class Conta {

    private String numeroCartao;
    private BigDecimal saldo = new BigDecimal("0.00");
    private BigDecimal poupanca = new BigDecimal("0.00");

    public Conta() {
    }

    public Conta(String numero, BigDecimal saldo, BigDecimal poupanca) {
        this.numeroCartao = numero;
        this.saldo = saldo;
        this.poupanca = poupanca;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String conta) {
        this.numeroCartao = conta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(BigDecimal poupanca) {
        this.poupanca = poupanca;
    }

    @Override
    public String toString() {
        return "Conta" + '\n' +
                "numero= " + numeroCartao + '\n' +
                "saldo= R$ " + saldo + '\n' +
                "poupanca= R$ " + poupanca;

    }
}
