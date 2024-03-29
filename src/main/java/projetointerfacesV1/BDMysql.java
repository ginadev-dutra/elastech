package projetointerfacesV1;

public class BDMysql implements IntercaceBD{

    @Override
    public void conectar() {
        System.out.println("Connecting on MySQL Server");
    }

    @Override
    public void desconectar() {
        System.out.println("MySQL Server disconnected");

    }

    @Override
    public void executar(String comando) {
        System.out.println("mysql> " + comando);
    }
}
