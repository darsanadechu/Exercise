package staticNestedClass;

class Animal
{
	static void print()
	{
		System.out.println("I am an animal");
	}
	
	static class Mammal 
	{
		static void display()
		{
			System.out.println("I am a mammal");
			print();
		}
	}
	
}


public class StaticNestedClass {

	public static void main(String[] arg)
	{

		Animal.Mammal.display();  //no need to create nested class instance since it is static
		
	}
}
