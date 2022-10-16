package ProjetoContaBancaria.core;

public class ContaBancaria {
    private int numeroConta;
    private int codigoVerificador;
    private String nomeTitular;
    private String cpfTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, int codigoVerificador, String nomeTitular, String cpfTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.codigoVerificador = codigoVerificador;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
    }

    // métodos espec[ificos referente à conta bancária
    public void depositar(double valor){
        this.saldo += valor;
    }

    public String exibirDados(){
        return String.format("Conta: " + numeroConta + " - " + codigoVerificador + " : " + nomeTitular
                + " (" + cpfTitular + ") " + String.format("%.2f", saldo));
    }

    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getCodigoVerificador() {
        return codigoVerificador;
    }

    public void setCodigoVerificador(int codigoVerificador) {
        this.codigoVerificador = codigoVerificador;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public double getSaldo() {
        return saldo;
    }
}
