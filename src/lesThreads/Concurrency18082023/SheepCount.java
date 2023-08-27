package lesThreads.Concurrency18082023;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepCount {
	
	// 1)version avec le type AtomicInteger
	
	private static AtomicInteger sheepCount1 = new AtomicInteger(0);
	private static int sheepCount2 = 0;
	
	private static void incrementAndReport()
	{
		
		//System.out.print(Thread.currentThread().getName()+" **** "+ ++sheepCount+"\t");
		//System.out.print(Thread.currentThread().getName()+" **** "+ sheepCount.incrementAndGet()+"\t");
		//sheepCount = sheepCount + 1
		//System.out.println(sheepCount);
	}

	// 2)Version 2 basé sur le mot clé Synchronized
	/*
	Callable c;
	private static int sheepCount = 0;
	private synchronized static void incrementAndReport()
	{
		
		System.out.print(Thread.currentThread().getName()+" **** "+ ++sheepCount+"\t");
		
		//sheepCount = sheepCount + 1
		//System.out.println(sheepCount);
	}*/
	
	

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		
		try {
			service = Executors.newFixedThreadPool(20);
			//service = Executors.newSingleThreadExecutor();
			
			//SheepCount sc = new SheepCount();
			
			for(int i=0; i<100;i++)
			{
				//service.submit(()->incrementAndReport());
				service.execute(()->{sheepCount1.incrementAndGet();sheepCount2++;});
			}
			Thread.sleep(10);
			System.out.println(sheepCount1+" "+sheepCount2);
		}
		finally {
			if(service!=null) {
				service.shutdown();
			}
		}
		

	}

}
