package elastech;

public class PessoaMain {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Frederico");
        p.setIdade("3 meses");
        p.setCidade("Barbacena");
        p.setPais("Brasil");

        p.setNome("Bartolomeu");


        System.out.println(p);


        Pessoa p2 = new Pessoa("Nadjen", "18 anos", "Rio de Janeiro", "Brasil");
        p2.setNome("Nadi");
        p2.setIdade("19 anos");

        System.out.println(p2.getNome() +" " + p2.getIdade());

    }


}
