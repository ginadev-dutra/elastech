package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TesteStreams {
	
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));

        Stream<String> streamTexto = Stream.of("A", "B", "C");

        ////
        
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

//        float total;
//        for (Produto p : arrayProdutos) {
//            total += p.getValor();
//
//
//        }

//        ArrayList<Cliente> lista = ClienteRepository.findAll().stream()
//                .filter(c -> c.idade > 40)
//                .limit(10)
//                .foreach(c -> System.out.println(c.nome));

        Stream<String> st = list.stream();
        st.forEach(p -> System.out.println(p));


        

	}

}
