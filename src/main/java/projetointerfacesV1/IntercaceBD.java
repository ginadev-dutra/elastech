package projetointerfacesV1;

public interface IntercaceBD {
    public void conectar();
    public void desconectar();
    public void executar(String comando);

}
