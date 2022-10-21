package ProjetoACME.userinterface;

import ProjetoACME.model.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario f1, f2, f3, f4;
      //  f = new Funcionario(1234, "Gina"); em classe abstrata não se pode instanciar objeto
        f1 = new Chefe(1234, "Gina Chefe", 5000.0, 15.0, 500.0);
        f2 = new Comissionado(1235, "Ana Comissionada", 4000.0, 35.0);
        f3 = new Horista(1236, "Paula Horista", 80.0, 150.0);
        f4 = new Empreiteiro(1237, "Pedro Empreiteiro", 5872.35);

        System.out.println(f1.getNumRegistro() + " - " + f1.getNome() + " R$ " + f1.calcularSalario());
        System.out.println(f2.getNumRegistro() + " - " + f2.getNome() + " R$ " + f2.calcularSalario());
        System.out.println(f3.getNumRegistro() + " - " + f3.getNome() + " R$ " + f3.calcularSalario());
        System.out.println(f4.getNumRegistro() + " - " + f4.getNome() + " R$ " + f4.calcularSalario());

    }
}
