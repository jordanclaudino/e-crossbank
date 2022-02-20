import java.math.BigDecimal;

public class Conta {

    private String numeroCartao;
    private BigDecimal saldo = new BigDecimal("0.00");
    private BigDecimal poupanca = new BigDecimal("0.00");
    private String senha;
    int numeroTeste = 100000;
    private String numeroString;


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

    public void setNumeroCartao(){
        numeroString = Integer.toString(numeroTeste);
        this.numeroCartao = numeroString;
        numeroTeste++;
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
