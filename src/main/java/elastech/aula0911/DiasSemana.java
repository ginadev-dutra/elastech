package elastech.aula0911;

public enum DiasSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO;

    public static void main(String[] args) {
        for(DiasSemana dia : DiasSemana.values()){
            System.out.println(dia);
        }
    }
}


