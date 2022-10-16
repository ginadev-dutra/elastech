package ProjetoContaBancaria.app;

import ProjetoContaBancaria.core.ContaBancaria;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        double valor;
        ContaBancaria conta = new ContaBancaria(1001, 2,
                "Gina", "12545698736", 100.00);

        do{
            System.out.println("GinaBank - Seu banco na Internet!");
            System.out.println("Digite: 1 - Depósito / 2 - Saque / 3 - Info / 0 - Sair");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    System.out.println(">>> DEPÓSITO - - Digite o valor: ");
                    valor = teclado.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.println(">>> SAQUE - - Digite o valor: ");
                    valor = teclado.nextDouble();
                    if(conta.sacar(valor)){
                        System.out.println("   Saque efetuado!");
                    }else{
                        System.out.println("   Saldo infuciciente!");
                    }
                    break;
                case 3:
                    System.out.println(">>> INFO: " + conta.exibirDados());
                    break;
                case 0:
                    System.out.println(">>> Obrigada pela preferência - Volte sempre!");
                    break;
                default:
                    System.out.println(" *** Opção inválida! ***");

            }

        }while(opcao != 0);


        teclado.close();
    }
}
