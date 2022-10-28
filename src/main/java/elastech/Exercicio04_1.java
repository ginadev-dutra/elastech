package elastech;

public class Exercicio04_1 {

    public void imprimir(int[] array) {
        for (int x = 0 ; x < array.length ; x++) {
            System.out.print(array[x] + "   ");
        }

        for (Integer item : array) {
            System.out.println(item);
        }
    }

    public int imprimirComWhile() {

        int index = 1;
        while (index < 10) {
            System.out.println(index);

            index++;


        }
        return 0;
    }
    public void imprimirComWhile(int[] array) {

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);

            index++;

        }

    }

    public static void main(String[] args) {

        int[] array = { 5, 6, 7};
        for (int x = 0 ; x < array.length ; x++) {
            array[x] = x + 1;
        }
        //array[0] = 1;
        //array[1] = 2;



        Exercicio04_1 e = new Exercicio04_1();
        e.imprimir(array);
        e.imprimirComWhile(array);
        e.imprimirComWhile();

        System.out.println(e.imprimirComWhile());

        int variavel = e.imprimirComWhile();
        System.out.println(variavel);
    }
}
