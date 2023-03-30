package MultiThreading;

class ThreadJoin extends Thread
{
	
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println("current thread  : "+Thread.currentThread().getName());
			
		}
		
	}
	
}

public class MultiThreadingDemo3 {
	
	public static void main(String[] arg)
	{
		
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		ThreadJoin t4 = new ThreadJoin();
		
		t1.start();
		
		try
		{
			
			t1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		
		t2.start();
		
		try
		{
			
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		t3.start();
		
		t4.start();
	}

}
