package lesThreads.Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		//ExecutorService service2 = null;
		
		Runnable t1 = () -> {
			System.out.println("T1 executed");
			System.out.println(Thread.currentThread().getName());
		};

		Runnable t2 = () -> {
			System.out.println("T2 executed");
			System.out.println(Thread.currentThread().getName());
		};
		//Supplier<Double>sup;
		Callable<Double> t3 = ()->{
			System.out.println(Thread.currentThread().getName());
			return Math.random();
			};

		try {
			 //service = Executors.newSingleThreadExecutor();
			 service = Executors.newFixedThreadPool(3);
			 //service = Executors.newCachedThreadPool();
			 service.execute(t1);
			// service.execute(t2);
			 Future<?> res0= service.submit(t2);
			 System.out.println("res0 = " + res0.get());
			 Future<Double> res= service.submit(t3);
			 System.out.println("res = " + res.get());
			 //service2 = Executors.newFixedThreadPool(3);
			 //service2.execute(t1);
		} finally {
			if(service!=null)
			{
				service.shutdown();
			}
			System.out.println("isShutdown : " + service.isShutdown());
			System.out.println("isTerminated : " + service.isTerminated());
			
			Thread.sleep(1000);
			
			System.out.println("isShutdown 2: " + service.isShutdown());
			System.out.println("isTerminated 2: " + service.isTerminated());
		}

	}

}
