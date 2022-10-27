package elastech.aula2510;

import java.util.ArrayList;

public class Exercicio01 {

    String[] listaDeCidades = { "SP", "Recife", "Salvador"} ;

    public void listarCidades() {
        String[] arrayCidades = new String[3];
        arrayCidades[0] = "SP";
        arrayCidades[1] = "Porto Alegre";
        arrayCidades[2] = "Fortaleza";

        for (int i = 0; i < arrayCidades.length; i++) {
            System.out.println(arrayCidades[i]);

        }
    }

    public void listarCidades(String[] cidades) {


        for (String c : cidades) { // para cada item na coleção cidades
            System.out.println(c);
        }
/*
        for (int x = 0 ; x < cidades.length ; x++) {
            System.out.println(cidades[x]);
        }

        int x = 0;
        while (x < cidades.length) {
            System.out.println(cidades[x]);
            x++;
        }
        */
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setNome("Banguinho");

        Animal animal2 = new Animal();
        animal2.setNome("Simba");
        animal2.setIdade(2);

        Animal[] a = new Animal[5];
        a[0] = animal2;
        a[1] = animal;

        //a[3]

        ArrayList lista = new ArrayList();
        lista.add(animal2);
        lista.add(animal); //
        lista.add(new Animal());

        //lista.get(1)



        String[] cidades = new String[3];
        cidades[0] = "SP";
        cidades[1] = "Porto Alegre";
        cidades[2] = "Fortaleza";

        Exercicio01 ex01 = new Exercicio01();
        ex01.listarCidades(cidades);
        ex01.listarCidades(ex01.listaDeCidades);
    }

}
