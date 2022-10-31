package lambdas;

public class ThreadComRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread!");
		
	}
	
	
	public static void main(String[] args) {
		ThreadComRunnable threadComRunnableELambda = new ThreadComRunnable();
		new Thread(threadComRunnableELambda).start();

	}

}
