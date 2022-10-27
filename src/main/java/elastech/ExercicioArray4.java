package elastech;

import ProjetoLambda.InterfaceServico;

public class ExercicioArray4 {

    public Integer encontrarMenorValor(Integer[] listaDeNumeros){

        // 4  9  0  3
        int menor = listaDeNumeros[0];
        for(int i = 1; i < listaDeNumeros.length; i++){
            menor = Math.min(menor, listaDeNumeros[i]);

           /* if(menor > listaDeNumeros[i]){
                menor = listaDeNumeros[i];
            }*/
        }
        return menor;
    }

    public static void main(String[] args) {

        Integer[] a = new Integer[] {10, 150, -5, 9, 0, -10};

      /*  for (Integer item : a ) {

        }

        // o de cima e o de baixo que estão comentados são iguais

        for (int i = 1; i < arg.length);{
            Integer item = arg[i];
        }*/

        ExercicioArray4 ex04 = new ExercicioArray4();
        Integer menorValor = ex04.encontrarMenorValor(a);
        System.out.println(menorValor);
    }
}
