package JavaCollections;
import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {

	public static void main(String[] arg)
	{
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "apple");
		hm.put(2, "orange");
		hm.put(3, "grapes");
		hm.put(4, "mango");
		
		System.out.println("keys and values :");
		for(Map.Entry entry:hm.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		
		hm.putIfAbsent(5, "pineapple");
		
		System.out.println("after adding pineapple :");
		for(Map.Entry entry:hm.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		
		hm.replace(5, "pineapple", "water melon");
		
		System.out.println("after replacing pineapple with water melon :");
		for(Map.Entry entry:hm.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		
		hm.remove(4);
		
		System.out.println("after removing key 4 :");
		for(Map.Entry entry:hm.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		
		hm.replaceAll((k,v) -> "apple");  
		
		System.out.println("after replacing all values with apple :");
		for(Map.Entry entry:hm.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		
	}
}