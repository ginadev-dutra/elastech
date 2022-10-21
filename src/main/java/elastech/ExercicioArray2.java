package elastech;

/*
Criar um array de 5 elementos Integer, atribuindo um valor a cada elemento (escolher os valores que quiser).
Escrever um método que encontre a soma de todos os valores.
 */
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
