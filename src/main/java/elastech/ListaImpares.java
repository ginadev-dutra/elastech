package elastech;

public class ListaImpares {

    public void listar() {
        for (int x = 1 ; x <= 100 ; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        ListaImpares li = new ListaImpares();
        li.listar();
    }
}
