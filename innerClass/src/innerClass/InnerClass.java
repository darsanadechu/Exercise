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
			System.out.println("8: get url in the given position");
			System.out.println("9: exit ");
			
			
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
								throw new InvalidURLException("Invalid URL extension");
							}
							catch(InvalidURLException e) 
							{
								System.out.println("Invalid URL extension");
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
					String currentUrl=null;
					int steps=0;
					try
					{
						System.out.println("enter the current url visiting");
						currentUrl=sc.next();
						System.out.println("enter the number of steps to move back");
						steps=sc.nextInt();
					}
					catch(InputMismatchException e)
					{
						System.out.println("mismatched input format");
					}
					String url = Browser.History.moveBackward(currentUrl,steps);
					try
					{
						if(url!=null)
						 System.out.println("History: "+url);
						else
							throw new NoHistoryFoundException("No History Found");
					}
					catch(NoHistoryFoundException e)
					{
						System.out.println("No History Found");
					}
					break;
				
			case 7: //move backward
					String currentUrl1=null;
					int steps1=0;
					try
					{
						System.out.println("enter the current url visiting");
						currentUrl1=sc.next();
						System.out.println("enter the number of steps to move forward");
						steps1 = sc.nextInt();
					}
					catch(InputMismatchException e)
					{
						System.out.println("mismatched input format");
					}
					
					String url1 = Browser.History.moveForward(currentUrl1,steps1);
					try
					{
						if(url1!=null)
							System.out.println("History "+url1);
						else
							throw new NoHistoryFoundException("No History Found");
					}
					catch(NoHistoryFoundException e)
					{
						System.out.println("No History Found");
					}
					break;
					
			case 8: //get url in given position
					System.out.println("enter position of url to be printed");
					int position = sc.nextInt();
					String url2 = Browser.History.get(position);
					if(url2!=null)
						System.out.println("URL at "+position+" is : "+url2);
					break;
				
			case 9://exit
					System.out.println("exiting the menu");
					break;
			default: System.out.println("invalid choice");
					
					
			}
			
		}while(choice!=9);
	}
}
