package elastech.aula3110;


import java.io.File;
import java.io.IOException;

public class DivisaoPorZero {


    public void lerArquivo() {
        File file = new File("C://arquivo.txt");
        try {
            file.getCanonicalPath();  // IOException
            //file.toPath();
            int v1 = 10;
            int v2 = 5;
            int total = v1 / v2;
        } catch (IOException e) {
            System.out.println("");
        } catch (ArithmeticException e) {
            //klajsdklsajdlkjsad
        } catch (Exception e) {
            e.getMessage();
            throw e;

        }




    }

    public void metodo1(int parametro) throws NumeroMenorQueVinteException {


        if (parametro < 20) {
            throw new NumeroMenorQueVinteException("Número precisa ser maior que 20");
        }

        /*
        try {
            tentarDividirPorZero(10, 0);
        } catch (Exception erro) {
            throw erro;
        }

         */

    }

    public void tentarDividirPorZero(int num, int divisor) throws ArithmeticException {
        //if (divisor == 0) return; // validacao
        try {
            int total = num / divisor;
            total = total * 10;
            System.out.println("O resultado foi: " + total);

        } catch (ArithmeticException e){

        	System.out.println(
                    num + " não pode ser dividido por 0");
            //throw e;
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //e.printStackTrace();

        } finally {
            System.out.println("Caiu no finally");
        }

    }
    
    public void acessarIndices(int index) throws ArrayIndexOutOfBoundsException {
    	
    	String[] nomes = {"Ana", "Maria", "Dani"};



    	//String nome = new String();

    	if (index >= nomes.length) {
            System.out.println("Tentativa de acesso a index indevido");
    		//return;
            throw new ArrayIndexOutOfBoundsException("sdfdsfsdf");
    	}



        String nome = nomes[index];


    	/*

        try {
            String nome = nomes[index];

        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Acessei um índice que não existe");
        	//throw e;

        } catch (Exception e){

        	System.out.println("Tentativa de acesso em índice inexistente");
            System.out.println(e.toString());

        }

    	 */
        /*
        finally {
        	System.out.println("Caiu no finally");
        }

         */

        
        //return nome;
    }
    
    
    
    public static void main(String[] args) {
        DivisaoPorZero zero = new DivisaoPorZero();

        try {
            zero.metodo1(10);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        try {
//            zero.tentarDividirPorZero(5,0);
//        } catch (ArithmeticException e) {
//            System.out.println("Chamei o método e retornou uma exceção");
//        }


        //acessarIndices(3);
    	/*
        try {
    		acessarIndices(7);
    	} catch (ArrayIndexOutOfBoundsException e) {
    		throw e;
    	}
    	*/
	}

}
