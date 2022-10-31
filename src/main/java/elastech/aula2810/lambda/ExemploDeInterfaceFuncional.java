package lambdas;

@FunctionalInterface
public interface ExemploDeInterfaceFuncional {
	
	void fazAlgo();
	
	// default methods são métodos que podem ter corpo
	default void fazOutraCoisa() {
		System.out.println("foo");
	}
}