package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TesteMap {
	
    public static void main(String[] args) {
        List<String> listaPessoas = new ArrayList<String>();
        listaPessoas.add("Ana");
        listaPessoas.add("José");
        listaPessoas.add("Maria");
        
        
        // cria uma nova
        // for na lista atual
        // para cada elemento faz upper
        // adiciono na lista nova
 
        listaPessoas.stream()
                .map(n -> n.toUpperCase())
                .forEach(n -> System.out.println(n));
        
        System.out.println("=======");
        
        for (String s : listaPessoas) {
        	System.out.println(s);
        }

    }

}
