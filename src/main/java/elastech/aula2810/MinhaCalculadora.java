package elastech.aula2810;

public class MinhaCalculadora implements Calculadora {


    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    @Override
    public int subtracao(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    @Override
    public int divisao(int a, int b) {
        return a / b;
    }

    @Override
    public int potencia(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        MinhaCalculadora c = new MinhaCalculadora();
        c.meuMetodoDefault();

        Calculadora.meuMetodoStatic();
    }
}
