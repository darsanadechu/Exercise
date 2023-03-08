package localInnerClass;

class OuterClass
{
	private int value=50;
	void print()
	{
		final int i=1;  //local variable can be final only
		class InnerClass
		{
			
			InnerClass()
			{
				System.out.println("local inner class");
				value=value+5;
				System.out.println("value = "+value+i);
			}
			
		}
		InnerClass Inner = new InnerClass();
	}
}

public class LocalInner {
	
	public static void main(String[] arg)
	{
		
		OuterClass Outer = new OuterClass();
		Outer.print();
	}

}
