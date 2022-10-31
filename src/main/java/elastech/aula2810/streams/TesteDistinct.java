package streams;

import java.util.ArrayList;
import java.util.List;

public class TesteDistinct {

	
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
        

        alunos.stream()
                .distinct()
                .forEach(a -> System.out.println(a));
    }
}
