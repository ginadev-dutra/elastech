package elastech;

public class ExercicioArray2 {
    Integer[] numeros = new Integer[]{12, 7, 26, 58, 69};


   public void somarNumeros(){
        int soma = 0;
        for(int i = 0; i < 5; i++){
           soma = soma + numeros[i];
        }
       System.out.println(soma);
    }

    public static void main(String[] args) {
        ExercicioArray2 s = new ExercicioArray2();
        s.somarNumeros();
    }


}
