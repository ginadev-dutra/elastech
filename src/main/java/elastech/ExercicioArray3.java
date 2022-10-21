package elastech;

/*
Criar um array de 4 elementos Integer, atribuindo um valor diferente a cada elemento (escolher os valores que quiser).
Escrever um método que encontre o menor valor dessa array.
 */
public class ExercicioArray3 {
    Integer numeros[] = new Integer[] {05, 7, 19, 12, 91};

    public void encontrarMenor() {
        int menor = numeros[0];
        for (int i = 0; i< 5; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Menor número do array:" + menor);
    }

    public static void main(String[] args) {
        ExercicioArray3 am = new ExercicioArray3();
        am.encontrarMenor();
    }
}