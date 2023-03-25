package Browser;
import java.util.*;


//main method
public class Browser {

	public static void main(String[] arg)
	{
		
		String choice;
		Scanner sc = new Scanner(System.in);
		 BrowserHistory B = new BrowserHistory();
		
		do
		{
			//menu
			System.out.println("          Menu");
			System.out.println("--------------------------");
			System.out.println("1 : visit url ");
			System.out.println("2 : sort history ");
			System.out.println("3 : delete history with index ");
			System.out.println("4 : delete history with url ");
			System.out.println("5 : delete history with extension ");
			System.out.println("6 : fetch all history ");
			System.out.println("7 : fetch history by extension ");
			System.out.println("8 : search history by extension ");
			System.out.println("9 : search urls by search word");
			System.out.println("10 : size of browser history");
			System.out.println("11 : Number of urls with particular extension");
			System.out.println("12: update url in the index");
			System.out.println("exit : exit menu");
			
			System.out.println();
			System.out.println("enter your choice");
			choice = sc.next();
			
			switch(choice)
			{
			case "1": //add url
					  System.out.println("enter url");
			          String url = sc.next();
			          try
			  		  {
			        	  B.visit(url);
			  		  }
			  		  catch(InvalidURLException e)
			  		  {
			  			  System.out.println("Invalid URL extension");
			  		  }
			          break;
			          
			          
			case "2": //history sort
				      System.out.println("Sorted History :");
					  B.sort();
					  break;
					  
					  
			case "3": //delete url by index
				      System.out.println("enter index of url to be deleted");
				      try
				      {
						  int index = sc.nextInt();
						  if(index<0 || index>B.historyList.size())
							  throw new InvalidPositionException("Invalid index position");
						  B.deleteHistory(index);
				      }
				      catch(InvalidPositionException e)
				      {
				    	  System.out.println("invalid index position");
				      }
					  break;
					  
					  
			case "4": //delete url bu url name
				      System.out.println("enter url to be deleted");
					  String deleteUrl = sc.next();
					  B.deleteHistory(deleteUrl);
					  break;
			          
					  
			case "5": //delete history by extension
				      B.deleteHistory();
			          break;
			          
				
			case "6"://fetch all history
				      System.out.println("History :");
			          B.fetchHistory();
			          break;
			          
			          
			case "7": //fetching history by extension
				      System.out.println("enter extension of url to be fetched");
	                  String fetchExtension	= sc.next();
	                  System.out.println("url with extension "+fetchExtension+" :");
	                  B.fetchHistory(fetchExtension);
	                  break;
			          
	                  
			case "8": //search url by extension
				      System.out.println("enter extension of urls to be searched");
			          String searchExtension = sc.next();
			          B.search(searchExtension);
			          break;
			          
			          
			case "9"://search url by search words
				      B.search();
			          break;
			          
			          
			case "10"://size of history 
				      System.out.println("size of history");
					  B.size();
					  break;
					  
					  
			case "11": //number of urls of particular extension
				       System.out.println("enter extension of url whoes size has to be found");
			           String sizeExtension = sc.next();
			           B.size(sizeExtension);
			           break;
			           
					  
			case "12"://update url by index 
				      System.out.println("enter index of url to be edited");
				      try
				      {
				          int editIndex = sc.nextInt();
				          if(editIndex<0 || editIndex>B.historyList.size())
				        	  throw new InvalidPositionException("Invalid index position");
					      B.updateHistory(editIndex);
				      }
				      catch(InvalidPositionException e)
				      {
				    	  System.out.println("invalid index position");
				      }
				      break;
				
				      
			case "exit" ://exit 
				         System.out.println("Menu exit");
			
				         
			default: System.out.println("Invalid choice");
			
			}
			
		}while(!choice.equals("exit"));
		
	}
}
