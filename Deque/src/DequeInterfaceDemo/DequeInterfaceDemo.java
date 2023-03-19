package DequeInterfaceDemo;
import java.util.*;

public class DequeInterfaceDemo {

	public static void main(String[] arg)
	{
		
		Deque<String> deque = new ArrayDeque<>();
		
		deque.add("1");
		deque.add("2");
		deque.add("3");
		deque.add("4");
		deque.add("5");
		
		System.out.println("Deque :");
		for(String str:deque)
			System.out.println(str);
		
		deque.offerFirst("0");
		
		System.out.println("after adding element at first :");
		for(String str:deque)
			System.out.println(str);
		
		System.out.println("after removing last element "+deque.pollLast()+" :");
		for(String str:deque)
			System.out.println(str);
		
		System.out.println("after removing first element "+deque.poll()+" :");
		for(String str:deque)
			System.out.println(str);
	}
}
