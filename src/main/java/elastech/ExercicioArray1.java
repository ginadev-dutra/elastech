package elastech;

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
