package elastech;

public class Curso {


    public void escrevaNome(){
        int x = 1;

        while (x <= 5){
            System.out.println("Elas Tech");
            x++;
        }
    }

    public static void main(String[] args) {

        Curso c = new Curso();
        c.escrevaNome();
        }
    }



