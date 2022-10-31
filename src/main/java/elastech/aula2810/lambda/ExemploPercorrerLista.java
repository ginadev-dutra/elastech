package lambdas;

import java.util.Arrays;
import java.util.List;

public class ExemploPercorrerLista {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for(Integer n: list) {
		    System.out.println(n);
		}


		
		System.out.println("=======");
		
		list.forEach(n -> System.out.println(n));
	}
}
