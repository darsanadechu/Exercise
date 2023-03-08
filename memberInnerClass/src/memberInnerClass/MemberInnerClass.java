package memberInnerClass;


class OuterClass
{
	private int value = 50;
	class InnerClass
	{

		void print()
		{
			value=value+5;
			System.out.println("member inner class");
			System.out.println("value : "+value);
		}
	}
}

public class MemberInnerClass {
	
	public static void main(String[] arg)
	{
		
		OuterClass Outer = new OuterClass();
		OuterClass.InnerClass Inner = Outer.new InnerClass();
		Inner.print();
	}

}
