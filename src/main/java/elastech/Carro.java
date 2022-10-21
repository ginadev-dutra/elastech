package elastech;

public class Carro {
   int numPortas;
   int ano;
   double preco;
   double km;
   String marca;
   String cor;

    public Carro() {
    }

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Azul");

        System.out.println(carro.getMarca());
        System.out.println(carro.getCor());


        Carro carro2 = new Carro();
        carro2.setMarca("Chevrolet");
        carro2.setCor("Vermelho");

        System.out.println(carro2.getMarca());
        System.out.println(carro2.getCor());

        Carro carro3 = new Carro();
        carro3.setKm(10000);
        carro3.setAno(2022);
        carro3.setNumPortas(4);
        carro3.setPreco(55000);

        System.out.println(carro3.getKm() + "\n" + carro3.getAno() + "\n" + carro3.getNumPortas() +"\n" + carro3.getPreco());

    }
}
