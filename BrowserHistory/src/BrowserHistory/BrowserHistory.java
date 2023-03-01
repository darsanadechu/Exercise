package BrowserHistory;
import java.util.Scanner;


public class BrowserHistory 
{
	public static void main(String[] arg)
	{
		
		Scanner sc=new Scanner(System.in);
		int numberOfBrowsing;
		System.out.println("enter number of browsing");
		numberOfBrowsing=sc.nextInt();
		String[] urlList= new String[numberOfBrowsing];
		int k=0;
		for(int i=0;i<numberOfBrowsing;i++)
		{
			System.out.println("enter url");
			String url=sc.next();
			boolean flag=false;
			for(int j=0;j<urlList.length;j++)
			{
				if(urlList[j]==null)
					{
						break;
					}
				String str=urlList[j].substring(0, urlList[j].length()-3);
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
			if(!flag)
			{
				url=url.concat("##1");
				urlList[k]=url;
				k++;
			}
			for(int m=0;m<urlList.length;m++)
				if(urlList[m]!=null)
					System.out.println(urlList[m]);
			
		}
		
		
		
	}
	
}
