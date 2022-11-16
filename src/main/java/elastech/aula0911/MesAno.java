package elastech.aula0911;

enum MesAno {


    JANEIRO(1), FEVEREIRO(2), MARCO(3), ABRIL(4),
    MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8), SETEMBRO(9),
    OUTUBRO(10), NOVEMBRO(1), DEZEMBRO(12);
    private int ordem;

    MesAno(int ordem) {

        this.ordem = ordem;
    }

    public int getOrdem() {

        return ordem;
    }
}
