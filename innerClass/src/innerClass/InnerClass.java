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
		boolean choice;
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
		
		//display shortcut
		System.out.println("shortcuts keys : ");
		Browser1.Shortcut();
		do
		{
			
			System.out.println("enter url");
			String url = sc.next();
			Browser.History.setHistory(url);
			System.out.println();
						
			//bookMark
			System.out.println("want to bookmark url");
			Browser.BookMarks bookMark = Browser1.new BookMarks();
			if(sc.nextBoolean())
			{
				bookMark.setBookMark(url);
			}
			System.out.println();
			
			//display history
			Browser.History.displayHistory();
			System.out.println();
			
			//display bookMarks
			bookMark.displayBookMarks();
			System.out.println();
			
			System.out.println("want to browse more ");
			choice = sc.nextBoolean();
		}while(choice);
		
	}
}
