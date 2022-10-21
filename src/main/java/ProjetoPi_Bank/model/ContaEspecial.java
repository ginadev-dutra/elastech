package ProjetoPi_Bank.model;

public class ContaEspecial extends Conta{

    private double limite;

    @Override
    public boolean debitar(double valor){
        if (super.saldo + this.limite >= valor){
            super.saldo -= valor;
            return true;
        }

        return false;
    }

    @Override
    public String toString(){
        return super.toString() + " Limite R$ " + this.limite;
    }

    public ContaEspecial(String nomeTitular, String cpf, int numero, double saldo, double limite) {
        super(nomeTitular, cpf, numero, saldo);
        this.limite = limite;
    }
}
