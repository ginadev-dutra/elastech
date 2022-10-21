package projetointerfacesV1;

public class MeuSistema {
    public static void main(String[] args) {
        // não se pode dar new aqui em interface
        IntercaceBD ibd;
        ibd = new BDMysql();

        // vou conectar no banco de dados
        ibd.conectar();

        // vou recuperar dados
        ibd.executar("SELECT * FROM tb_clientes");

        // vou desconectar
        ibd.desconectar();
    }
}
