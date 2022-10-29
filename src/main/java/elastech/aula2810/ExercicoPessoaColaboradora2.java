package elastech.aula2810;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicoPessoaColaboradora2 {

    public static void main(String[] args) {


        List<PessoaColaboradora> listaPessoas = new ArrayList<PessoaColaboradora>();
        listaPessoas.add(new PessoaColaboradora("Gina", 15000, 35));
        listaPessoas.add(new PessoaColaboradora("Nina", 10000, 45));
        listaPessoas.add(new PessoaColaboradora("Lina", 12000, 20));
        listaPessoas.add(new PessoaColaboradora("Brina", 11000, 16));


        ArrayList<PessoaColaboradora> lista = (ArrayList) listaPessoas.stream()
                .filter(p -> p.getIdade() > 30)
                .map(p ->
                {
                    p.setSalario((float) (p.getSalario() + (p.getSalario() * 0.20)));
                    return p;
                }
        ).collect(Collectors.toList());


        lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getSalario()));

    }


}
