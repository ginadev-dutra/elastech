package streams;

import java.util.ArrayList;
import java.util.List;

public class TesteSkip {

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
        

        alunos.stream()
                .distinct()
                .skip(2)
                .forEach(a -> System.out.println(a));
    }
    
    

}
