package elastech;

/*
Escrever uma classe, com um atributo int chamado "mes". Criar um método chamado "escreverMesExtenso".
Caso o "mes" seja igual a 1, escrever através de System.out.println a String "Janeiro".
Caso o "mes" seja igual a 2, escrever a String "Fevereiro", e assim por diante. Modificar o valor de "mes"
para testar várias possibilidades.
 */

public class Switch {

//    public static void main(String[] args) {
//
//        int mes = 5;
//
//        switch (mes) {
//            case 1:
//                System.out.println("janeiro");
//                break;
//            case 2:
//                System.out.println("fevereiro");
//                break;
//            case 3:
//                System.out.println("março");
//                break;
//            case 4:
//                System.out.println("abril");
//                break;
//            case 5:
//                System.out.println("maio");
//                break;
//            case 6:
//                System.out.println("junho");
//                break;
//            case 7:
//                System.out.println("julho");
//                break;
//            case 8:
//                System.out.println("agosto");
//                break;
//            case 9:
//                System.out.println("setembro");
//                break;
//            case 10:
//                System.out.println("outubro");
//                break;
//            case 11:
//                System.out.println("novembro");
//                break;
//            case 12:
//                System.out.println("dezembro");
//                break;
//        }
//    }

    int mes = 4;

    public static void main(String[] args) {
        Switch exercicio = new Switch();
        exercicio.escreverMesExtenso();
    }

    public void escreverMesExtenso() {
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Não corresponde a nenhum mês");
                break;
        }
    }
}

