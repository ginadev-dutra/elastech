package elastech.aula0111;

public class SaqueInsuficienteException extends Exception {
    public SaqueInsuficienteException() {
        super("Saldo insuficiente");
    }
}

