package listIterator;
import java.util.*;

public class ListIteratordemo {

	public static void main(String[] arg)
	{
		
		List<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> itr = list.listIterator();
		
		System.out.println("tranversing in forward direction");
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		System.out.println("tranversing in backward direction");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}
}
