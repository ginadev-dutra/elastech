package elastech.aula2710;


import elastech.Pessoa;

public class Colaborador extends Pessoa {

    private float salario;
    private Colaborador gerente;

    public Colaborador() {

    }
    public Colaborador(String nome, int idade, float salario, Colaborador gerente) {
      super();


      super.setNome(nome);

        this.setNome(nome);
      //  this.setIdade(idade);

        this.salario = salario;
        this.gerente = gerente;

      //  super.falar();
    }

    public void falar() {
        //super.falar();
        System.out.println("Oi, sou um colaborador");
    }

    public void usar() {
        falar();
     //   super.falar();
    }

    public static void main(String[] args) {
        Colaborador c = new Colaborador();
        c.usar();

       // Colaborador.super.falar();

    }
}
