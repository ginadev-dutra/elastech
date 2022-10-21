package ProjetoHeranca.core;
// subclasse
public class Estudante extends Pessoa{

    private int numeroMatricula;
    private String curso;

    // por ter colocado um construtor em na super class, tenho que colocar um construtor com os atributos
    // desta super class aqui também.
    public Estudante(String nome, String email, String telefone, int numMat, String curso) {
        super(nome, email, telefone); // chamando o construtor da classe pai
        this.numeroMatricula = numMat;
        this.curso = curso;
    }

    public int getNumeroMatricula() {

        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {

        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // aqui eu faço uma sobescrita de método = redefinição
    public String exibirInfo(){
        /*return getNome() + " / " + getEmail() + " / " + getTelefone() + " / " + getNumeroMatricula() +
                " / " + getCurso(); */

        // return getNome() + " / " + getEmail() + " / " + getTelefone() + " / " + numeroMatricula + " / " + curso; // se usar private na superclass Pessoa

        // return nome + " / " + email + " / " + telefone + " / " + numeroMatricula + " / " + curso; // se usar protected na superclass Pessoa ou como está abaixo

        return super.nome + " / " + super.email + " / " + super.telefone + " / " + this.numeroMatricula + " / " + this.curso;
    }
}
