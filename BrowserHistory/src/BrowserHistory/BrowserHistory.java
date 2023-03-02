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
		int index=2;
		int value=0;
		for(int i=0;i<numberOfBrowsing;i++)
		{
			//new url
			System.out.println("enter visited url");
			String url=sc.next();
			boolean flag=false;
			for(int j=0;urlList[j]!=null;j++)
			{
				int length=urlList[j].length();
				index=urlList[j].lastIndexOf("#");
				if(value>=9)
					index++;
				String str=urlList[j].substring(0, (length-(index+1)));
				//if url is already exsisit
				if(url.equals(str))
				{
					
					char[] ch = new char[10];
					urlList[j].getChars(index+1,length,ch,0);
					String a=new String(ch);
					a=a.trim();
					value=Integer.valueOf(a);
					String newUrl=urlList[j].replace(a,String.valueOf(value+1));
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
