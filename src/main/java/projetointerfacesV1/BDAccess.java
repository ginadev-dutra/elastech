package projetointerfacesV1;

public class BDAccess implements IntercaceBD{

    // aqui temos que ter o compromisso de criar uma implementação
    @Override
    public void conectar() {
        System.out.println("Conectando no banco ACCESSS");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco ACESSS");
    }

    @Override
    public void executar(String comando) {
        System.out.println("ms-access> " +comando);
    }


}
