package elastech.aula0911;

public class TamanhoCamisetas {
	
	public static void main(String[] args) {
		Tamanho tamanho = Tamanho.PEQUENO;

		switch (tamanho) {
			case PEQUENO:
				System.out.println("Camiseta Pequena");
				break;
			case MEDIO:
				System.out.println("Camiseta Media");
				break;
			case GRANDE:
				System.out.println("Camiseta Grande");
				break;
		}
	}
}
