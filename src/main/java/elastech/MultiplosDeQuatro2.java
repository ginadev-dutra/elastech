package elastech;

public class MultiplosDeQuatro2 {

    public void imprimir(){


        for(int i = 0; i <=100; i++){
            if(i % 4 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        MultiplosDeQuatro2 m = new MultiplosDeQuatro2();
        m.imprimir();
    }
}
