package lambdas;

public class ThreadComLambda {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("Thread com função lambda!");
		new Thread(r).start();

		
		new Thread(
				() -> System.out.println("Thread com função lambda..."))
		.start();
	}

}
