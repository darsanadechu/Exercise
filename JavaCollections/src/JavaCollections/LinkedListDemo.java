package JavaCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo {

	public static void main(String[] arg)
	{
		LinkedList<String> list1 = new LinkedList<>();
		
		list1.add("1");
		list1.add("2");
		list1.add("3");
		
		System.out.println(list1);
		
		LinkedList<String> list2 = new LinkedList<>();
		
		list2.add("4");
		list2.add("5");
		list2.add("6");
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		list1.addFirst("0");
		list1.addLast("7");
		
		System.out.println("elements :");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		list1.removeAll(list2);
		
		System.out.println(list1);
		
		list1.addAll(5, list2);
		
		System.out.println(list1);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		Iterator<String> i = list1.descendingIterator();
		
		System.out.println("elements :");
		while(i.hasNext())
			System.out.println(i.next());
		
		list1.retainAll(list2);
		System.out.println(list1);
		
	}
}
