package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TesteFilter {
	
	public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(0);
        listaNumeros.add(5);
        listaNumeros.add(13);
        listaNumeros.add(15);
        listaNumeros.add(6);
        
        //Stream st = listaNumeros.stream()                          
          //      .filter(num -> num > 5);

        
        //String nome = new String("bla");
        
        Optional<Integer> op = listaNumeros.stream()                          
                .filter(num -> num > 5)
                .findFirst();
                //.forEach(n -> System.out.println(n));  

        System.out.println(op.get());
        
        //listaNumeros.stream() 
        //      .forEach(n -> System.out.println(n));  
        /*
        System.out.println("=================");
        
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        listaPessoas.add(new Pessoa("Ana", "Recife", 23));
        listaPessoas.add(new Pessoa("Marcos", "Maceió", 15));
        listaPessoas.add(new Pessoa("Maria", "SP", 54));

        listaPessoas.stream()
                .filter(pessoa -> pessoa.getIdade() > 18 && pessoa.getIdade() < 50)
                .forEach(pessoa -> System.out.println(pessoa.getNome()));
        
*/        
        

	}

}
