package BrowserHistory;
import java.util.Scanner;

public class BrowserHistory 
{
	public static void main(String[] arg)
	{
		
		Scanner sc=new Scanner(System.in);
		//number of browsing history
		int numberOfBrowsing;
		System.out.println("enter number of browsing");
		numberOfBrowsing=sc.nextInt();
		//array to store url history
		String[] urlList= new String[numberOfBrowsing];
		int k=0;
		for(int i=0;i<numberOfBrowsing;i++)
		{
			//new url
			System.out.println("enter visited url");
			String url=sc.next();
			boolean flag=false;
			for(int j=0;urlList[j]!=null;j++)
			{
				//taking url without ## number
				String[] splitString=urlList[j].split("##");
				//if url is already exist
				if(url.equals(splitString[0]))
				{
					int length=urlList[j].length();
					int index=urlList[j].lastIndexOf("#");
					char[] ch = new char[10];
					urlList[j].getChars(index+1,length,ch,0);
					String stringValue=new String(ch);
					stringValue=stringValue.trim();
					int value=Integer.valueOf(stringValue);
					String newUrl=urlList[j].replace(stringValue,String.valueOf(value+1));
					urlList[j]=urlList[j].replace(urlList[j],newUrl);
					flag=true;
				}
			}
			//if new url comes
			if(!flag)
			{
				url=url.concat("##1");
				urlList[k]=url;
				k++;
			}
			//print all visited url
			for(String str1:urlList)
				if(!(str1==null))
					System.out.println(str1);
			
		}	
		
	}
	
}
