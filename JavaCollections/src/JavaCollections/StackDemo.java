package JavaCollections;
import java.util.*;


public class StackDemo {

	public static void main(String[] arg)
	{
		
		
		Stack<Integer> integerStack = new Stack<>();
		
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		integerStack.push(5);
		integerStack.push(10);
		
		
		System.out.println("position of element 5 is : "+integerStack.search(5));
		
		integerStack.forEach(n->
		{
				System.out.println(n);
		});
			
		System.out.println("element on pop function :");
		System.out.println(integerStack.pop());
		
		
	}
}
