package ProjetoLambda;

public class ClasseQueUsa {
    public static void main(String[] args) {

        InterfaceServico i;

        i = new InterfaceServico() {
            public void executa(int valor){
                System.out.println("Estou executando algo... " +valor);
            }
        };
        i.executa(10);

       /* InterfaceServico i2 = new InterfaceServico() {
            @Override
            public void executa() {
                System.out.println("Outra lógica de execução");
            }
        };*/

        InterfaceServico i2 = (valor) -> {
            System.out.println("Outra lógica de execução - " + valor);
        };
        i2.executa(20);
    }
}
