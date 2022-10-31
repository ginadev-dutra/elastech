package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TesteLimit {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<>();
        alunos.add("Ana");
        alunos.add("Maria");
        alunos.add("José");
        alunos.add("Ana");
        alunos.add("Marcos");
        alunos.add("Maria");
        alunos.add("Marcos");
        alunos.add("André");
        alunos.add("Ana");
        alunos.add("Marcos");
        

//        Stream st = alunos.stream()
//                .distinct();
//
//        st.limit(2).forEach(a -> System.out.println(a));

        alunos.stream()
                .distinct()
                .limit(2)
                .forEach(a -> System.out.println(a));

        System.out.println("=======");


        for (String s: alunos) {
            System.out.println(s);

        }

	}

}
