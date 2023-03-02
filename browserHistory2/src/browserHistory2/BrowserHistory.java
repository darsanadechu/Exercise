package browserHistory2;
import java.util.ArrayList;
import java.util.Scanner;


public class BrowserHistory 
{
	
	public static void main(String[] arg)
	{
		//array list to store urls
		ArrayList<StringBuilder> urlList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		boolean choice;
	
		do
		{
			boolean flag=false;
			System.out.println("Enter visited url");
			StringBuilder url = new StringBuilder(); 
			url.append(sc.next());
			
			for(StringBuilder str:urlList)
			{
				//to get url alone in dummy
				int index=str.lastIndexOf("#");
				StringBuilder dummy = new StringBuilder();
				dummy.append(str.substring(0, index-1));
				
				//if url already exist
				if((url.toString()).equals(dummy.toString()))
				{
					char[] ch = new char[10];
					str.getChars(index+1,str.length(),ch,0);
					String stringValue=new String(ch);
					stringValue=stringValue.trim();
					int value=Integer.valueOf(stringValue);
					str.replace(index+1,str.length(),String.valueOf(value+1));
					flag=true;

				}
				
			}
			
			//when new url comes
			if(!flag)
			{
				System.out.println("yes");
				url.append("##1");
				urlList.add(url);
			}
			
			//print all visited urls
			for(StringBuilder str:urlList)
				System.out.println(str);
			
			System.out.println("Want to browse more");
			choice=sc.nextBoolean();
		}while(choice);
		
	}

}
