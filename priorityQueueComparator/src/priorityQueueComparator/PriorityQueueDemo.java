package priorityQueueComparator;

import java.util.*;

class MyComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return s1.length()-s2.length();
	}
}

public class PriorityQueueDemo {

	public static void main(String[] arg)
	{
		
		MyComparator comparator = new MyComparator();
		PriorityQueue<String> pq = new PriorityQueue<String>(10,comparator);
		
		System.out.println("datas :");
		pq.add("darshana");
		pq.add("darshu");
		pq.add("darsana");
		pq.add("dechu");
		
		for(String str:pq)
			System.out.println(str);
		
		System.out.println("order of data stored : ");
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		
	}
}
