package anonymousInnerClass;


abstract class Outer
{
	int value=50;
	abstract void print();
}
public class AnonymousInner {

	public static void main(String[] arg)
	{
		Outer Obj = new Outer()
		{
			void print()
			{
			System.out.println("anonymous inner class");
			value=value+5;
			System.out.println("value :"+value);
			}
		};
		Obj.print();
	}
}
