package BrowsersApp;

import java.util.ArrayList;

//parent class
public class Browser
{
	private ArrayList<String> urlList=new ArrayList<>();
	Browser()
	{
		
	}
	//set history
	void setHistory(String url)
	{
		urlList.add(url);
	}
	
	//display history
	void displayHistory()
	{
		System.out.println("History : ");
		for(String str:urlList)
			System.out.println(str);
	}
	
	void whoAmI()
	{
		System.out.println("I am a browser");
	}
}

