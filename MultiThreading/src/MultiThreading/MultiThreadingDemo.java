package MultiThreading;


class Multi implements Runnable
{
	
	public void run()
	{
		
		System.out.println("thread is running");
	}
	
}


public class MultiThreadingDemo {

	public static void main(String[] arg)
	{
		
		Multi r1 = new Multi();
		Thread t1 = new Thread(r1,"my thread");
		
		
		t1.start();
		
		String name = t1.getName();
		System.out.println("Name of thread : "+name);
		
	}
}
