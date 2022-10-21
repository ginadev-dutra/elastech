package elastech;

public class Predio {
    String endereco;
    String cidade;
    String estado;
    int numApts;

    public Predio() {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumApts() {
        return numApts;
    }

    public void setNumApts(int numApts) {
        if(numApts > 0){
            this.numApts = numApts;
        }else {
            System.out.println("Numero invalido");
        }
    }

    public String toString(){
        return "Numero de Apartamentos = "+getNumApts()+ "\n"+
                "Endereco = "+getEndereco()+"\n"+
                "Cidade = "+getCidade()+"\n"+
                "Estado = "+getEstado()+"\n\n";
    }
    public static void main(String[] args) {

        Predio predio1 = new Predio();
        predio1.setNumApts(5);
        predio1.setEndereco("Rua das Flores 10");
        predio1.setCidade("Rio de Janeiro");
        predio1.setEstado("Rio de Janeiro");
        System.out.println(predio1.toString());

        Predio predio2 = new Predio();
        predio2.setNumApts(0);
        predio2.setEndereco("Rua Rio Branco");
        predio2.setCidade("Marilia");
        predio2.setEstado("São Paulo");
        System.out.println(predio2.toString());

    }
}
