package elastech.aula2810;


public interface Calculadora {

    public int soma(int a, int b);

    public int subtracao(int a, int b);

    public int multiplicacao(int a, int b);

    public int divisao(int a, int b);

    public int potencia(int a, int b);

    public default String meuMetodoDefault() {
        return "Esse é meu método default";
    }

    public static String meuMetodoStatic() {
        return "Esta é minha calculadora";
    }
}
