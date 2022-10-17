package elastech;

public class Pessoa {

    public String nome;
    private int idade;

    public String cidade;



    public void correr(int km){
      /*  if(km == 2){
            System.out.println("Você está indo bem");
        } else if(km > 2){
            System.out.println("Você está arrasando");
        } else {
            System.out.println("Você está iniciando");
        } */

        if(km < 2){
            System.out.println("Você está indo bem");
        } else {
            System.out.println("Você está arrasando");
        }

        String mensagem = (km < 2) ? "Você está indo bem" : "Você está arrasando";
        System.out.println(mensagem);
        // var bairro;
        //
    }

   /* public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 30;

        Pessoa p2 = new Pessoa();
        p2.nome = "Ana";
        p2.idade = 30;

        // p1 e p2 tem o estado igual
    } */

    public static void main(String[] args) {
        int x = 0;
        x++; // variável, acrescente 1 dentro de você - x = x + 1
        System.out.println(x); // 1

        ++x;
        System.out.println(x); // 2

        System.out.println(x++); // 2 primeiro usa o valor e depois soma, aqui não tinha sido somado ainda

        // aqui o x é 3
        System.out.println(x);

        System.out.println(++x); // 4 aqui soma primeiro e depois mostra o valor

        int y = 100;

        System.out.println(y--); // aqui ainda é 100 pq mostra primeiro e depois diminui

        System.out.println(y); // aqui é 99

        System.out.println(--y); // aqui é 98
    }
}
