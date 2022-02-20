import java.math.BigDecimal;

public class Conta {

    private String numeroCartao;
    private BigDecimal saldo = new BigDecimal("0.00");
    int numeroTeste;
    private String numeroString;


    public Conta() {
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

    public void depositar (BigDecimal valor){
        this.setSaldo(this.getSaldo().add(valor));
    }

    public boolean sacar (BigDecimal valor) {
        if(this.getSaldo().compareTo(valor) == 0 || this.getSaldo().compareTo(valor) == 1){
            this.setSaldo(this.getSaldo().subtract(valor));
            return true;
        }
        return false;



    }

    @Override
    public String toString() {
        return "Conta" + '\n' +
                "numero= " + numeroCartao + '\n';

    }

}
