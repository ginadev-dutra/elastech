package ProjetoPi_Bank.app;

import ProjetoPi_Bank.model.Conta;
import ProjetoPi_Bank.model.ContaEspecial;

public class PiBank {
    public static void main(String[] args) {
        Conta c1 = new Conta("Gina", "98656244569", 1234, 100.00);
        // System.out.println(c1.toString());
        // System.out.println(c1);

        Conta c2 = new ContaEspecial("Nina", "12465985632", 4321, 100.00, 100.00);
        // pelo polimorfismo, não precisamos colocar ContaEspecial no primeiro Conta.
        // ContaEspecial é uma Conta
        // O que define qual cálculo será feito é a instância, new Conta ou new ContaEspecial

        System.out.println(c1);
        System.out.println(c2);

        c1.debitar(80);
        c2.debitar(180);

        System.out.println(c1);
        System.out.println(c2);
    }
}
