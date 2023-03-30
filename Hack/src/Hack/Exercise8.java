package Hack;
import java.util.Scanner;


//main method
public class Exercise8 {

	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		
		Browser B = new Browser();
		Hacker H = new Hacker();
		String choice;
		
		do
		{
		
			System.out.println("MENU");
			System.out.println("1: visit url");
			System.out.println("2: Modify file contents");
			System.out.println("3: display browser history ");
			System.out.println("4: display hacker file");
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
						  		  H.addToFile();
						  }
						  else
							  throw new InvalidURLException("Invalid URL extension");
			  		  }
					  catch(InvalidURLException e)
			  		  {
			  			  System.out.println("Invalid URL extension");
			  		  }
					  break;
					  
					  
					  
			case "2": //modify file and history
				      System.out.println("enter url to modify file");
					  String urlNew = sc.next();
					  try
			  		  {
						  if(urlNew.endsWith(".com") || urlNew.endsWith(".org") || urlNew.endsWith(".in"))
						  {
							  H.modify(urlNew);
						  }
						  else
							  throw new InvalidURLException("Invalid URL extension");
			  		  }
					  catch(InvalidURLException e)
			  		  {
			  			  System.out.println("Invalid URL extension");
			  		  }
					  break;
					  
					  
					  
			case "3": //display browser history
					  B.display();
					  break;
					  
					  
					  
			case "4": //display hacker file
				      H.fetchFile();
					  break;
					  
					  
					  
			case "exit": //exit
				         System.out.println("exiting menu");
			             break;
			             
			             
			             
			default : System.out.println("invalid choice"); 
			
			}
			
		}while(!choice.equals("exit"));
		
	}
}