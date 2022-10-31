package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio02 {

    public static void main(String[] args) {

        List<PessoaColaboradora> listaPessoas = new ArrayList<PessoaColaboradora>();
        listaPessoas.add(new PessoaColaboradora("Ana", 10000, 0));
        listaPessoas.add(new PessoaColaboradora("José", 5000, 0));
        listaPessoas.add(new PessoaColaboradora("Marcos", 8000, 0));

        ArrayList<PessoaColaboradora> lista = (ArrayList) listaPessoas.stream().map(p ->
        {
            p.setSalario(p.getSalario() + (p.getSalario() * 0.15));
            return p;
        }
        ).collect(Collectors.toList());


        lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getSalario()));



    }
}
