package Hack;
import java.util.ArrayList;


//browser class
class Browser
{
	public static ArrayList<String> history = new ArrayList<>();
	
	//visit url
	void visit(String url)
	{
		
		history.add(url);
			
	}
	
	
	//display history
	void display()
	{
		System.out.println("History : ");
		for(String str : history)
			System.out.println(str);
		
	}
	
}