package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TesteFlatMap {

	
	public static void main(String[] args) {
        List<List<Integer>> listaNumeros = new ArrayList<>();
        listaNumeros.add(Arrays.asList(5,10,20));
        listaNumeros.add(Arrays.asList(25,0,100));
        listaNumeros.add(Arrays.asList(25,8,15));

        Stream<Integer> stream = listaNumeros
        		.stream()
        		.flatMap(i -> i.stream())
        		.filter(i -> i > 8 && i < 22);
        
        stream.forEach(i -> System.out.println(i));
    }
}
