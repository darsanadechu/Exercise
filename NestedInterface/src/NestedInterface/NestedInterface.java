package NestedInterface;


interface Outer
{
	public static interface Inner
	{
		void print();
		
	}
}

class InterfaceImp implements Outer.Inner
{
	public void print()
	{
		System.out.println("nested interface implemented");
	}
}

public class NestedInterface {

	public static void main(String[] arg)
	{
		Outer.Inner Obj = new InterfaceImp();
		Obj.print();
	}
}
