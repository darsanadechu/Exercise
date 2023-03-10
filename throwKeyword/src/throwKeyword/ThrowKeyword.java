package throwKeyword;


class SuperClass 
{
	void method() throws ArithmeticException
	{
		throw new ArithmeticException("Exception occured");
	}
	
}


public class ThrowKeyword {
	
	public static void main(String[] arg)
	{
		SuperClass Obj = new SuperClass();
		
		try
		{
			Obj.method();
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled");
		}
		
		
	}

}
