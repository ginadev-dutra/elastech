package ProjetointerfacesV2;

public class AplicacaoQueUsaCalculos {
    public static void main(String[] args) {
        // situação 1 - preciso chamar o método do objetodo jeito que ele é

        ObjetoQueCalcula o = new ObjetoQueCalcula();
        o.realizaAlgumCalculo();

        // situação 2 - o módulo x só consegue chamar via método calcularValores()

        InterfaceModulo1 i1 = o;
        i1.calcularValores(); // visão do módulo 1

        // situação 3 - o módulo y só consegue chamar via método efetivarContas()

        InterfaceModulo2 i2 = o;
        i2.efetivarContas(); // visão do módulo 2
    }
}
