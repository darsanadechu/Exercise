package exceptionHandling;

class A
{
	void method() 
	{
		int[] a = new int[5];
		a[5] = 1;	//exception occurs
		a[1] = 50/0;	//exception occurs but will not execute since exception already occurred
		System.out.println(a[5]);
	}
}


public class ExceptionHandling {
	
	public static void main(String[] arg)
	{
		A Obj = new A();
		
		try
		{
			//nested try
			try
			{
				Obj.method();
			}catch(ArithmeticException e)
			{
				System.out.println("exception handled by ArithmeticException");
			}
			
		//multiple catch
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled by ArrayIndexOutOfBoundsException");
		}
		
		//finally block
		finally
		{
			System.out.println("finally block");
		}
		
		//rest of the codes
		System.out.println("rest of the code");
	}

}
