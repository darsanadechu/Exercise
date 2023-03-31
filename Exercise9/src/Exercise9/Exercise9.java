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
	void display()
	{
		System.out.println("History : ");
		for(String str : history)
			System.out.println(str);
		
	}
	
}

//readHistory thread
class ReadHistory extends Thread
{
	
	public void run()
	{
		System.out.println("History :");
		for(String str:Browser.history)
			System.out.println(str);
		
	}
}


//deleteHistory thread
class DeleteHistory extends Thread 
{
	Scanner sc = new Scanner(System.in);
	
	public void run()
	{
		System.out.println("enter url to be deleted");
		String url = sc.next();
		Browser.history.remove(url);
		
	}
}

//main class
public class Exercise9 {
	
	public static void main(String[] arg)
	{
		
		try
		{
			Browser B = new Browser();			
			Scanner sc = new Scanner(System.in);
			
			String choice;
			
			do
			{
				ReadHistory t1 = new ReadHistory();
				DeleteHistory t2 = new DeleteHistory();
			
				System.out.println("MENU");
				System.out.println("1: visit url");
				System.out.println("2: read and delete history");
				System.out.println("exit : exit menu");
				
				System.out.println("enter choice");
				choice = sc.next();
				
				switch(choice)
				{
				
				case "1": //visit url
						  System.out.println("enter visited url");
						  String url = sc.next();
						  try
						  {
							  if(url.endsWith(".com") || url.endsWith(".org") || url.endsWith(".in"))
							  {
							  B.visit(url);
							  B.display();
					  		  
							  }
							  else
								  throw new InvalidURLException("Invalid URL extension");
						  }
						  catch(InvalidURLException e)
						  {
							  System.out.println("Invalid URL extension");
						  }
						  break;
						  
				case "2": //read and delete history
					      t1.start();
					      t1.join();
					      t2.start();
					      t2.join();
					      break;
				       	 
					
				case "exit": //exit
							 System.out.println("exiting menu");
							 break;
		             
		             
		             
				default : System.out.println("invalid choice"); 
		
				}
		
			}while(!choice.equals("exit"));
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
