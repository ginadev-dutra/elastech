package elastech;


public class Exercicio03 {

    public Integer encontrarMenorValor(Integer[] arg) {

        // 4  9  0  3
        int menor = arg[0];
        for (int i = 1; i < arg.length ; i++) {
            menor = Math.min(menor, arg[i]);


            /*
            if (menor > arg[i]) {
                menor = arg[i];
            }

             */
            
        }

        return menor;
    
    }

    public static void main(String[] args) {

        Integer[] a = new Integer[] { 10, 150 , -5, 9, 0, -10} ;


        Exercicio03 ex03 = new Exercicio03();
        Integer menorValor = ex03.encontrarMenorValor(a);

        System.out.println(ex03.encontrarMenorValor(a));

        System.out.println(menorValor);
    }
}
