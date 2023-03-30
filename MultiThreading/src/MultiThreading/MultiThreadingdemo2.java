package MultiThreading;


class MultiThread1 extends Thread
{
	
	public void run()
	{
		
		for(int i=1;i<6;i++)
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
		}
	}
	
}

public class MultiThreadingdemo2 {
	
	public static void main(String[] arg)
	{
		
		//main thread
		for(int i=1;i<=5;i++)
		{
			
			try
			{
				Thread.sleep(500);
				System.out.println(i);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.println();
		
		//custom thread
		MultiThread1 t1 = new MultiThread1();
		MultiThread1 t2 = new MultiThread1();
		
		t1.start();
		t2.start();
	}

}
