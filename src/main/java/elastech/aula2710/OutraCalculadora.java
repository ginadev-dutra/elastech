package elastech.aula2710;

public abstract class OutraCalculadora implements Calculadora {

    @Override
    public int soma(int a, int b) {
        return 0;
    }

    @Override
    public int subtracao(int a, int b) {
        return 0;
    }


    public abstract String imprime();

}

// colocando abstract não precisa colocar todos os métodos da interface
// mas ela também não pode ser instânciada.
