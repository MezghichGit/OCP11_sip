package lesThreads;

public class MonThread extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int j =0; j<10;j++ )
		{
			System.out.println("j = "+j);
		}
		
	}

}
