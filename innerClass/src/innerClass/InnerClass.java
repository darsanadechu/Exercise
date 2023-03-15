package innerClass;
import java.util.InputMismatchException;
import java.util.Scanner;


//main method	
public class InnerClass {

	public static void main(String[] arg) throws Exception
	{
		boolean BookMarkChoice = false;
		int choice=0;
		Scanner sc = new Scanner(System.in);
		
		Browser Browser1 = new Browser()
		{
			public void Shortcut()
			{
				System.out.println("Reloads your current page : ⌘ +R");
				System.out.println("Opens the find baR : ⌘+F");
				System.out.println("Prints your current page : ⌘+P");
				System.out.println("Saves your current page : ⌘+S");
			}
		
		};
		Browser.BookMarks bookMark = Browser1.new BookMarks();
		
		
		do
		{
			System.out.println();
			System.out.println("Menu :");
			System.out.println("1: add urls and bookmarks");
			System.out.println("2: display urls");
			System.out.println("3: display bookmark");
			System.out.println("4: display shortcut");
			System.out.println("5: delete url");
			System.out.println("6: move backward");
			System.out.println("7: move forward");
			System.out.println("8: exit ");
			
			
			
			System.out.println("enter your choice ");
			try
			{
				choice=sc.nextInt();
			}catch(InputMismatchException e) 
			{
				System.out.println(e);
				System.out.println("entered choice is wrong");
				sc.nextLine();
				continue;
			}
			
			switch(choice)
			{
			case 1: do
					{
				
						//history
						System.out.println("enter url");
						String url = sc.next();
						if(url.endsWith(".com") || url.endsWith(".in") || url.endsWith(".org"))
						{
							Browser.History.setHistory(url);
						}
						else
						{
							try
							{
								throw new InvalidUrlException("Invalid URL format");
							}
							catch(InvalidUrlException e) 
							{
								System.out.println("Invalid URL format");
								sc.nextLine();
								continue;
							}
						}
								
						
						//bookMark
						System.out.println("want to bookmark url");
						try
						{
							if(sc.nextBoolean())
							{
								bookMark.setBookMark(url);
							}
							System.out.println("want to browse more ");
						
							BookMarkChoice = sc.nextBoolean();
						}
						catch(InputMismatchException e)
						{
							System.out.println("mismatched input format");
							sc.nextLine();
							continue;
						}
					}while(BookMarkChoice);
					break;
					
			case 2: //display history
					Browser.History.displayHistory();
					break;
					
			case 3: //display bookMarks
					bookMark.displayBookMarks();
					break;
					
			case 4: //display shortcut
					System.out.println("shortcuts keys : ");
					Browser1.Shortcut();
					break;
					
			case 5: //delete url
					System.out.println("enter url to be deleted");
					Browser.History.deleteHistory(sc.next());
					break;
					
			case 6: //move backward
					System.out.println("enter the current url visiting");
					String currentUrl=sc.next();
					System.out.println("enter the number of steps to move back");
					int steps=sc.nextInt();
					Browser.History.moveBackward(currentUrl,steps);
					break;
				
			case 7: //move backward
					System.out.println("enter the current url visiting");
					String currentUrl1=sc.next();
					System.out.println("enter the number of steps to move forward");
					int steps1=sc.nextInt();
					Browser.History.moveForward(currentUrl1,steps1);
					break;
			case 8://exit
					System.out.println("exiting the menu");
					break;
			default: System.out.println("invalid choice");
					
					
			}
			
		}while(choice!=8);
	}
}
