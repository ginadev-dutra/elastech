package elastech.aula0111;

public class Banco {

    public Conta saque(double valor, Conta conta) throws SaqueInsuficienteException {

        if (valor < conta.getSaldo()) {
            //conta.setSaldo(conta.getSaldo() - valor);

            double valorCalculado = conta.getSaldo() - valor;
            conta.setSaldo(valorCalculado);

            return conta;

        } else {
            throw new SaqueInsuficienteException();
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Conta c1 = new Conta();
        c1.setSaldo(50);

        Conta c2 = new Conta();
        c2.setSaldo(8000);

        Conta c3 = new Conta();
        c3.setSaldo(200);

        try {
            c1 = banco.saque(10, c1);
            System.out.println("Novo saldo: " + c1.getSaldo());

        } catch (SaqueInsuficienteException e) {
            System.out.println(e.getMessage() + " na conta C1");
        }

        try {

            c2 = banco.saque(9000, c2);
            System.out.println("Novo saldo: " + c2.getSaldo());

        } catch (SaqueInsuficienteException e) {
            System.out.println(e.getMessage() + " na conta C2");
        }

        try {
            c3 = banco.saque(30, c3);
            System.out.println("Novo saldo: " + c3.getSaldo());
        } catch (SaqueInsuficienteException e) {
            System.out.println(e.getMessage() + " na conta C3");
        }
    }
}
