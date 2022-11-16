package elastech.aula0911;

public class Mes2{

        public void verificaMeses(MesAno mes){
            switch (mes) {
                case JANEIRO:
                    System.out.println(Mes.JANEIRO.getOrdem());
                    break;
                case FEVEREIRO:
                    System.out.println(Mes.FEVEREIRO.getOrdem());
                    break;
                case MARCO:
                    System.out.println(Mes.MARCO.getOrdem());
                    break;
                case ABRIL:
                    System.out.println(Mes.ABRIL.getOrdem());
                    break;
                case MAIO:
                    System.out.println(Mes.MAIO.getOrdem());
                    break;
                case JUNHO:
                    System.out.println(Mes.JUNHO.getOrdem());
                    break;
                case JULHO:
                    System.out.println(Mes.JULHO.getOrdem());
                    break;
                case AGOSTO:
                    System.out.println(Mes.AGOSTO.getOrdem());
                    break;
                case SETEMBRO:
                    System.out.println(Mes.SETEMBRO.getOrdem());
                    break;
                case OUTUBRO:
                    System.out.println(Mes.OUTUBRO.getOrdem());
                    break;
                case NOVEMBRO:
                    System.out.println(Mes.NOVEMBRO.getOrdem());
                    break;
                case DEZEMBRO:
                    System.out.println(Mes.DEZEMBRO.getOrdem());
                    break;
            }
        }

        public static void main(String[] args) {
        Mes2 meses = new Mes2();
        meses.verificaMeses(MesAno.SETEMBRO);

        }
    }



