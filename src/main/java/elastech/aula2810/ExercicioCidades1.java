package elastech.aula2810;

import elastech.aula2810.Cidade;

import java.util.ArrayList;

public class ExercicioCidades1 {

    public static void main(String[] args) {

        Cidade c = new Cidade(150000, "Barbacena");


        ArrayList<Cidade> lista = new ArrayList<Cidade>();
        lista.add(new Cidade(150000, "Barbacena"));
        lista.add(new Cidade(80000, "Rio"));
        lista.add(new Cidade(20000, "Mariana"));
        lista.add(new Cidade(1050000, "JF"));

        lista.stream()
                .filter(cidade -> cidade.getHabitantes() > 100000)
                .forEach(cidade -> System.out.println(cidade.getNome()));


        System.out.println("============");

        for (Cidade cidade: lista) {
            if(cidade.getHabitantes() > 100000){
                System.out.println(cidade.getNome());
            }
        }
    }
}
