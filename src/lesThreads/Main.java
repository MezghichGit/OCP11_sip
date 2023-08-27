package lesThreads;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Begin");
		/*
		 * Worker w1 = new Worker(); new Thread(w1).start(); new MonThread().start();
		 * Worker w2 = new Worker(); new Thread(w2).start();
		 */

		Runnable task1 = () -> {
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 10; i++) {
				System.out.println("i = " + i);
			}
		};
		
		Runnable task2 = () -> {
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 10; i++) {
				System.out.println("j = " + i);
			}
		};

		new Thread(task1).start();
		new Thread(task2).start();
		System.out.println("End");
	}
}
