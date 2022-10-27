package elastech.aula2510;

public class Animal {

    private String nome;
    private String raca;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void helloWorld() {

        System.out.println("Olá!");

    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.helloWorld();

     //  helloWorld();
    }

}
