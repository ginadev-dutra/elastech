package elastech;

/*
Criar um array de 3 elementos String, atribuindo um nome de cidade a cada elemento. Escrever um método que liste esses nomes
 */

public class ExercicioArray1 {
    String[] cidades = new String[] {"Rio de janeiro", "Vitória", "Slavador"};

    public void listarCidades(){
        for(int i = 0; i < 3; i++){
            System.out.println(cidades[i]);
        }
    }
    public static void main(String[] args) {
        ExercicioArray1 s = new ExercicioArray1();

        s.listarCidades();
    }




}
