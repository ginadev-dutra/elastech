package elastech;

public class MultiplosDeQuatro  {

    public int imprimir() {

        int contador = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
                contador++;
            }


        }
        return contador;
    }

    public static void main(String[] args) {
        MultiplosDeQuatro mult = new MultiplosDeQuatro();

        //Math.

        int totalDeNumerosImpressos = mult.imprimir();

        System.out.println(totalDeNumerosImpressos);
    }
}
