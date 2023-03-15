package innerClass;
import java.util.ArrayList;


//main class
abstract class Browser
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
		
		//delete url
		static void deleteHistory(String url)
		{
			boolean flag = true;
			String deleteUrl=null;
			for(String str:history)
			{
				if(url.equals(str))
				{
					deleteUrl = url;
					flag = false;
				}
			}
			if(flag)
				System.out.println(url +" not found");
			else
			{
				history.remove(deleteUrl);
				System.out.println("url deleted");
			}
		}
		
		static String moveBackward(String currentUrl,int steps) throws IndexOutOfBoundsException
		{
			int currentIndex = history.indexOf(currentUrl);
			int newIndex = currentIndex-steps;
			String url = null;
			try
			{
				if(history.get(newIndex) != null)
				{
					url = history.get(newIndex);
				}
			}
			catch (IndexOutOfBoundsException e)
			{
			}
			finally
			{
				return url;
			}

		}
		
		
		static String moveForward(String currentUrl,int steps) throws IndexOutOfBoundsException
		{
			int currentIndex = history.indexOf(currentUrl);
			int newIndex = currentIndex+steps;
			String url1 = null;
			try
			{
				if(history.get(newIndex) != null)
				{
					url1 = history.get(newIndex);
				}
			}
			catch (IndexOutOfBoundsException e)
			{
			}
			finally
			{
				return url1;
			}

		}
		
		static String get(int position)
		{
			String url2=null;
			try
			{
				if(position < 0)
					throw new InvalidPositionException("Invalid position");
				else if(position>history.size())
					throw new IndexOutOfBoundsException("Invalid position");
				else
					url2 = history.get(position);
			}
			catch(InvalidPositionException e)
			{
				System.out.println("Provide only positive values");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("Invalid position");
			}
			finally
			{
				return url2;
			}
		}
	}

}

