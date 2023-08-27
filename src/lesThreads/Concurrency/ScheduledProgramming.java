package lesThreads.Concurrency;

import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledProgramming {

	public static void main(String[] args) {
		    System.out.println(LocalTime.now());
		    ScheduledExecutorService service = null;

			Runnable t1 = ()->
			{System.out.println(LocalTime.now());
			
			System.out.println(Thread.currentThread().getName());};
		
			service = Executors.newScheduledThreadPool(3);
			//service.schedule(t1, 2, TimeUnit.SECONDS);
			//service.scheduleAtFixedRate(t1, 2,3, TimeUnit.SECONDS);
			service.scheduleWithFixedDelay(t1, 2,3, TimeUnit.SECONDS);
		

	}

}
