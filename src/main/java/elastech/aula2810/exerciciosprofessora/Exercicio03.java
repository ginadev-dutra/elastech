package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio03 {

    public static void main(String[] args) {

        List<PessoaColaboradora> listaPessoas = new ArrayList<PessoaColaboradora>();
        listaPessoas.add(new PessoaColaboradora("Ana", 10000, 35));
        listaPessoas.add(new PessoaColaboradora("José", 5000, 40));
        listaPessoas.add(new PessoaColaboradora("Marcos", 8000, 20));

        ArrayList<PessoaColaboradora> lista = (ArrayList) listaPessoas.stream()
                .filter(p -> p.getIdade() > 30)
                .map(p ->
                {
                    p.setSalario(p.getSalario() + (p.getSalario() * 0.2));
                    return p;
                }
        ).collect(Collectors.toList());


        lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getSalario()));



    }
}
