package elastech;

public class ListaPares {

    public void listar(){

        int par = 0;

        while(par % 2 == 0){
            System.out.println(par);
            par++;
        }

    }

    public static void main(String[] args) {
        ListaPares lista = new ListaPares();

        lista.listar();
    }

}
