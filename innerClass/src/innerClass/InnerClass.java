package innerClass;
import java.util.ArrayList;
import java.util.Scanner;


abstract //main class
class Browser
{
	abstract void Shortcut();
	//member inner class
	class BookMarks
	{
		static ArrayList<String> bookMark = new ArrayList<>();
		
		//add a bookMark
		void setBookMark(String url)
		{
			bookMark.add(url);
		}
		
		//view bookMarks
		void displayBookMarks()
		{
			System.out.println("BookMarks :");
			for(String str:bookMark)
				System.out.println(str);
		}
		
	}
	
	
	//static nested class
	static class History
	{
		static ArrayList<String> history = new ArrayList<>();
		
		//set history
		static void setHistory(String url)
		{
			history.add(url);
		}
		
		//display history
		static void displayHistory()
		{
			System.out.println("History : ");
			for(String str:history)
				System.out.println(str);
		}
	}

}
	
public class InnerClass {

	public static void main(String[] arg)
	{
		boolean BookMarkChoice;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> shortcut = new ArrayList<>();
		
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
		
		
		for(int i=1;i<10;i++)
		{
			System.out.println("Menu :");
			System.out.println("1: add urls");
			System.out.println("2: display urls");
			System.out.println("3: display bookmark");
			System.out.println("4: display shortcut");
			
			System.out.println("enter your choice ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: do
					{
						//history
						System.out.println("enter url");
						String url = sc.next();
						Browser.History.setHistory(url);
									
						//bookMark
						System.out.println("want to bookmark url");
						if(sc.nextBoolean())
						{
							bookMark.setBookMark(url);
						}
						System.out.println("want to browse more ");
						BookMarkChoice = sc.nextBoolean();
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
			default: System.out.println("invalid choice");
					
					
			}
		}
	}
}
