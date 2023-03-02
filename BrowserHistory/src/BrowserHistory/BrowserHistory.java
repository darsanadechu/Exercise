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
			for(int j=0;j<urlList.length;j++)
			{
				if(urlList[j]==null)
					{
						break;
					}
				String str=urlList[j].substring(0, urlList[j].length()-3);
				//if url is already exsisit
				if(url.equals(str))
				{
					int length=urlList[j].length();
					char a=urlList[j].charAt(length-1);
					int value=Character.getNumericValue(a);
					String newUrl=urlList[j].replace(String.valueOf(a),String.valueOf(value+1));
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
