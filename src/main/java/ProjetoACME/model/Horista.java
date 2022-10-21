package ProjetoACME.model;

public class Horista extends Funcionario{
    private double valorHora;
    private double numeroHoras;

    public Horista(int numRegistro, String nome, double valorHora, double numeroHoras) {
        super(numRegistro, nome);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(double numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public double calcularSalario() {
        return numeroHoras * valorHora;
    }
}
