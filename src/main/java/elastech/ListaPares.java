package elastech;

public class ListaPares {

    public void listar(){

        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        ListaPares lp = new ListaPares();

        lp.listar();
    }

}
