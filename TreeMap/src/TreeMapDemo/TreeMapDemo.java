package TreeMapDemo;
import java.util.*;


class Items
{
	String name;
	float price;
	
	Items(String name,float price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String toString()
	{
		return name+" "+price;
	}
}

public class TreeMapDemo {

	public static void main(String[] arg)
	{
		
		TreeMap<Integer,Items> items = new TreeMap<>();
		
		Items I1 = new Items("book",35);
		Items I2 = new Items("pen",10);
		Items I3 = new Items("pencil",6);
		
		items.put(1, I1);
		items.put(2, I2);
		items.put(3, I3);
		
		for(Map.Entry<Integer,Items> entry:items.entrySet())
		{
			int key = (int) entry.getKey();  
	        Items I = (Items) entry.getValue();  
	        System.out.println(key+" Details:");
	        System.out.println(I);
		}
		
		System.out.println("ceiling of key 1 : "+items.ceilingEntry(3));
		System.out.println("head Map : "+items.headMap(2, true));
		System.out.println("tail Map : "+items.tailMap(2, true));
		System.out.println("sub Map : "+items.subMap(2, true,2,true));
		System.out.println("descending Map : "+items.descendingMap());
        System.out.println("removing last element "+items.pollLastEntry()+" : ");
        System.out.println(items);
	}
}
