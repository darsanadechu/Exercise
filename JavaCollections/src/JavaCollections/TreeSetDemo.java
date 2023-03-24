package JavaCollections;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] arg)
	{
		
		TreeSet<String> set = new TreeSet<>();
		
		set.add("binu");
		set.add("manu");
		set.add("anu");
		set.add("malu");
		
		System.out.println("original elements :");
		for(String str:set)
			System.out.println(str);
		
		System.out.println("first elements : "+set.first());
		System.out.println("last elements : "+set.last());
		System.out.println("higher element than malu : "+set.higher("malu"));
		System.out.println("lower elements than malu : "+set.lower("malu"));
		
		System.out.println("head set upto malu : "+set.headSet("malu", false));
		System.out.println("head set upto malu : "+set.tailSet("malu", true));
		System.out.println("subset : "+set.subSet("binu",true, "malu",true));
	
		System.out.println("removing first element "+set.pollFirst()+ " : ");
		for(String str:set)
			System.out.println(str);
		
		System.out.println("element higher than equal to mul : "+set.ceiling("mal"));
		System.out.println("element lower than equal to mul : "+set.floor("mal"));
	
	}
}