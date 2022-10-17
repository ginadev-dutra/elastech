package ProjetoHeranca.userinterface;

import ProjetoHeranca.core.Estudante;
import ProjetoHeranca.core.Pessoa;

public class AppUniversidade {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Gina");
        p.setEmail("gina_20_01@hotmail.com");
        p.setTelefone("99965-7485");
        System.out.println(p.exibirInfo());

        Estudante e = new Estudante();

        e.setNome("Nina");
        e.setEmail("nina@hotmail.com");
        e.setTelefone("99177-5669");
        e.setCurso("Farmácia");
        e.setNumeroMatricula(12345);
        System.out.println(e.exibirInfo());

    }
}
