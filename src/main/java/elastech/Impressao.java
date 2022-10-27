package elastech;

public class Impressao {

    public static void listaNumeros1a10(){


        /*for(int i = 1 ; i <= 10; i++){

            System.out.println(i);

        }*/


     /*    int i = 1;

        while(i <= 10){
            System.out.println(i);
            i++;
        }*/


        Integer[] a = new Integer[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for (Integer numeros : a) {
            System.out.println(numeros);
        }
    }

    public static void main(String[] args) {
        listaNumeros1a10();
    }
}
