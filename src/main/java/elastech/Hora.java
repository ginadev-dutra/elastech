package elastech;
/*
Escrever uma classe, com um atributo int chamado "hora". Criar um método chamado "verificaPeriodo".
Caso a hora esteja entre 0 e 5, escrever através de System.out.println a String "madrugada". Caso a hora seja maior que
5 e menor que 12, escrever "manhã". Caso a hora seja maior ou igual a 12 e menor que 18, escrever "tarde".
Caso contrário, escrever "noite".

 */

public class Hora {
    // public void verificaPeriodo(int hora){

    public String verificaPeriodo(int hora){

        if (hora > 0 && hora < 5){
            // System.out.println("Madrugada");
            return "Madrugada";
        }else if(hora > 5 && hora < 12){
            //System.out.println("Manhã");
            return "Manhã";
        } else if(hora >=12 && hora < 18 ){
            //System.out.println("Tarde");
            return "Tarde";
        }else{
            //System.out.println("Noite");
            return "Noite";
        }
    }

    public static void main(String args[]){

        Hora hora = new Hora();

        // hora.verificaPeriodo(20);

        System.out.println(hora.verificaPeriodo(20));
    }
}
