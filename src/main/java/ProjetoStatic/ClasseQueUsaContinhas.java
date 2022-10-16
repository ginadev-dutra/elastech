package ProjetoStatic;

public class ClasseQueUsaContinhas {
    public static void main(String[] args) {
        int s = Utilitarios.soma(5, 8);
        int p = Utilitarios.potencia(2, 5);

        System.out.println(s);
        System.out.println(p);
        System.out.println("Valor do PI " + Utilitarios.pi);
    }
}
