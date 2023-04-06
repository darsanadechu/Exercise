package Exercise9;
import java.util.ArrayList;
import java.util.Scanner;



//custom exception
class InvalidURLException extends Exception
{
	public InvalidURLException(String errorMessage)
	{
		super(errorMessage);
	}
}


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
	synchronized void display()
	{
		
		System.out.println("History : ");
		for(String str : history)
			System.out.println(str);
	}
	
	//delete history
	synchronized void delete()
	{
		int len = Browser.history.size();
		for(int i=0;i<len;i++)
		{	
			System.out.println(Browser.history);
			Browser.history.remove(0);
			
		}
		System.out.println("history deleted");
	}
	
}

//main class
public class Exercise9 {
	
	public static void main(String[] arg)
	{
		
			Browser B = new Browser();			
			Scanner sc = new Scanner(System.in);
			boolean choice;
			
			//read thread
			Thread ReadHistory = new Thread()
					{
				public void run()
				{
						B.display();
					
				}
				
					};
			
			//delete thread
			Thread DeleteHistory = new Thread()
					{
				public void run()
				{

					B.delete();
				}
					};
			
			
			//visit urls
			do
			{
				System.out.println("enter visited url");
				String url = sc.next();
				try
		  		  {
					  if(url.endsWith(".com") || url.endsWith(".org") || url.endsWith(".in"))
					  {
							  B.visit(url);
					  }
					  else
						  throw new InvalidURLException("Invalid URL extension");
		  		  }
				  catch(InvalidURLException e)
		  		  {
		  			  System.out.println("Invalid URL extension");
		  		  }
				System.out.println("want to visist more");
			    choice = sc.nextBoolean();
			}
			while(choice);
			
	
			ReadHistory.start();
			DeleteHistory.start();

			

	}

}
