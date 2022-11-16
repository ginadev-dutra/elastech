package elastech.aula0911;

public enum ValoresCartasEnum {
	
	J(11), Q(12), K(13), A(14);

	private int valorDaCarta;

	ValoresCartasEnum(int valor) {
		valorDaCarta = valor;
	}

	public int getValorDaCarta() {
		return valorDaCarta;
	}
}
