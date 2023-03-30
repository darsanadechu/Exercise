package MultiThreading;


class ThreadPriority extends Thread
{
	
	ThreadPriority(String name)
	{
		
		super(name);
		
	}
	
	public void run()
	{
		System.out.println("running");
	}
	
}



public class MultiThreadingDemo4 {

	public static void main(String[] arg)
	{
		ThreadPriority t1 = new ThreadPriority("t1");
		ThreadPriority t2 = new ThreadPriority("t2");
		
		System.out.println("names : "+t1.getName()+" , "+t2.getName());
		System.out.println("before setting priority ");
		System.out.println("priority of t1 : "+t1.getPriority());
		System.out.println("priority of t2 : "+t2.getPriority());
		
		t1.setPriority(1);
		t2.setPriority(6);
		
		System.out.println("after setting");
		System.out.println("priority of t1 : "+t1.getPriority());
		System.out.println("priority of t2 : "+t2.getPriority());
		System.out.println("priority of main : "+Thread.currentThread().getPriority());
		
		
		
	}
}
