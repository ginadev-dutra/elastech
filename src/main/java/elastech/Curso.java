package elastech;

/*
Escrever uma classe chamada Curso, com um método chamado "escreveNome". Usando o while, escrever
"Elas Tech" por 5 vezes, usando System.out.println
 */

//public class Curso {
//
//
//    public void escrevaNome(){
//        int x = 1;
//
//        while (x <= 5){
//            System.out.println("Elas Tech");
//            x++;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Curso c = new Curso();
//        c.escrevaNome();
//        }
//    }


public class Curso {

    public String variavel;

    public static void escreveNome() {

        int x = 0;

        while (x < 5) {
            x++;
            System.out.println("Elas Tech");
        }

    }

    public static void main(String[] args) {
        //Curso c = new Curso();
        //c.escreveNome();

        escreveNome();
    }
}

