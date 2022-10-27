package elastech.aula2510;

public class Exercicio2 {

    public void somarValores(Integer[] array) {

        int total = 0;
        for (Integer valor : array) {
            total += valor;
        }

        System.out.println(total);
    }

    public Integer somarValoresComRetorno(Integer[] array) {

        int total = 0;
        for (Integer valor : array) {
            total += valor;
        }

        return total;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] { 4, 5, 0, 4, 1};

        Exercicio2 ex2 = new Exercicio2();
        ex2.somarValores(array);

        System.out.println(ex2.somarValoresComRetorno(array));

        int variavel = ex2.somarValoresComRetorno(array);
        System.out.println(variavel);
    }
}
