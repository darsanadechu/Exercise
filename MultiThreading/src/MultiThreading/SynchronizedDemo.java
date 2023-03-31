package MultiThreading;


class Table
{
	
	 synchronized void print(int n)
	{
		
		 try
		{
				
			for(int i=1;i<=5;i++)
			{
				System.out.println(i*n);
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class SynThread1 extends Thread
{
	Table t = new Table();
	
	SynThread1(Table t)
	{
		this.t=t;  
	}  
	
    public void run()
	{
		t.print(5);
	
	}
	
}



class SynThread2 extends Thread
{
	Table t = new Table();
	
	SynThread2(Table t)
	{
		this.t=t;  
	}  
	
    public void run()
	{
		t.print(2);
	}
	
}


public class SynchronizedDemo {
	
	public static void main(String[] arg)
	{
		Table t = new Table();
	
		SynThread1 t1 = new SynThread1(t);
		SynThread2 t2 = new SynThread2(t);
			
		t1.start();
		t2.start();
		
	}

}
