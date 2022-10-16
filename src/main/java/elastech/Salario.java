package elastech;
/*
Escrever uma classe, com um atributo int chamado "salario". Criar um método chamado "informaValorImposto".
Caso o salario seja maior que 5000, retornar 15. Caso contrário, retornar 5.

 */

public class Salario {
    public int informaValorImposto(int salario){

        //public void informaValorImposto(int salario){

        if (salario >= 5000){
            //ystem.out.println("15");
            return 15;
        }else{
            // System.out.println("5");
            return 5;
        }


        //  System.out.println((salario >= 5000) ? "15 ": "5");
    }

    public static void main(String args[]){

        Salario salario = new Salario();

        // salario.informaValorImposto(4000);
        //int temp = salario.informaValorImposto(4000);
        //System.out.println(temp);
        System.out.println(salario.informaValorImposto(4000));

    }

}
