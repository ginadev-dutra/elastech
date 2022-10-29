/*
package elastech.aula2810;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicoPessoaColaboradora {

    public static void main(String[] args) {


        List<PessoaColaboradora> listaPessoas = new ArrayList<PessoaColaboradora>();
        listaPessoas.add(new PessoaColaboradora("Gina", 15000));
        listaPessoas.add(new PessoaColaboradora("Nina", 10000));
        listaPessoas.add(new PessoaColaboradora("Lina", 12000));
        listaPessoas.add(new PessoaColaboradora("Brina", 11000));

        */
/*lista.stream()
                .map(n -> n.getSalario() + (n.getSalario() * 0.15))

                .forEach(n -> System.out.println(n));*//*


        ArrayList<PessoaColaboradora> lista = (ArrayList) listaPessoas.stream().map(p ->
                {
                    p.setSalario((float) (p.getSalario() + (p.getSalario() * 0.15)));
                    return p;
                }
        ).collect(Collectors.toList());


        lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getSalario()));

    }


}
*/
