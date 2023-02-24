package BrowsersApp;
import java.util.ArrayList;
import java.util.Scanner;

//interface
interface MultipleAccountContainers
{
	
	void addContainer(String container1);
	void leaveContainer(String container2);
	void viewAllContainers();
}

//parent class
class Browser
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

//sub class google chrome
class GoogleChrome extends Browser
{
	
	static final double versionNumber=1.0;
	boolean isLocationAccessible=false;
	boolean isCameraAccessible=false;
	boolean isMicrophoneAccessible=false;
	GoogleChrome()
	{
		
	}
	
	
	@Override void whoAmI()
	{
		super.whoAmI();
		System.out.println("I am Google Chrome\n");
	}
	
	//overloading
	//set and reset by all permission at a time
	void setPermissions(boolean b)
	{
		isLocationAccessible=b;
		isCameraAccessible=b;
		isMicrophoneAccessible=b;
		
	}
	//set and reset by one at a time permission
	void setPermissions(boolean b1,boolean b2,boolean b3)
	{
		isLocationAccessible=b1;
		isCameraAccessible=b2;
		isMicrophoneAccessible=b3;
		
	}
	
	//display permissions
	void viewPermissions()
	{
		System.out.println("Is location accessible : "+isLocationAccessible);
		System.out.println("Is camera accessible : "+isCameraAccessible);
		System.out.println("Is microphone accessible : "+isMicrophoneAccessible+"\n");
	}
}

//sub class fire fox and implements interface
class Firefox extends Browser implements MultipleAccountContainers
{
	
	ArrayList<String> containers=new ArrayList<>();
	Firefox()
	{
		
	}
	
	
	@Override void whoAmI()
	{
		super.whoAmI();
		System.out.println("I am Firefox\n");
	}

	@Override
	public void addContainer(String container1) 
	{
		
		containers.add(container1);
	}

	@Override
	public void leaveContainer(String container2) 
	{
		containers.remove(container2);
		
	}

	@Override
	public void viewAllContainers() 
	{
		
		for(String str:containers)
			System.out.println(str);
		System.out.println();
	}
}

public class BrowsersApp {

	public static void main(String[] arg)
	{
		int countChrome=0;
		boolean option;
		//list of all browsers
		ArrayList<Browser> allBrowsers=new ArrayList<Browser>();
		Scanner sc=new Scanner(System.in);
		
		GoogleChrome tabOne=new GoogleChrome();
		allBrowsers.add(tabOne);
		tabOne.whoAmI();
		tabOne.setHistory("www.fcebook.com");
		tabOne.setHistory("www.youtube.com");
		tabOne.displayHistory();
		
		Browser tabTwo=new Firefox();
		tabTwo.whoAmI();
		tabTwo.setHistory("zoho.com");
		tabTwo.setHistory("java.com");
		tabTwo.displayHistory();
		allBrowsers.add(tabTwo);
		
		Browser tabThree=new GoogleChrome();
		allBrowsers.add(tabThree);
		
		
		
		for(Browser B:allBrowsers)
			if(B instanceof GoogleChrome)
				countChrome++;
		System.out.println("Google chrome browsers availabe : "+countChrome);
		System.out.println();
		
		//multiple account containers
		Firefox browser=new Firefox();
		browser.addContainer("facebookContainer");
		browser.addContainer("Mails");
		browser.addContainer("PrivateBrowsing");
		
		browser.viewAllContainers();
		
		browser.leaveContainer("PrivateBrowsing");
		
		browser.viewAllContainers();
		browser.whoAmI();
		
		
		do
		{
			
			System.out.println("1: Set all permissions");
			System.out.println("2: Reset all permissions");
			System.out.println("3: set separate permissions");
			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: //set all permissions
					option=true;
					tabOne.setPermissions(option);
					tabOne.viewPermissions();
					break;
			case 2: //Reset all permissions
					option=false;
					tabOne.setPermissions(option);
					tabOne.viewPermissions();
					break;
			case 3: //set separate permissions
					System.out.println("Enter location,camera and microphone access options : ");
			        boolean option1=sc.nextBoolean();
			        boolean option2=sc.nextBoolean();
			        boolean option3=sc.nextBoolean();
					tabOne.setPermissions(option1,option2,option3);
					tabOne.viewPermissions();
					break;
			default: System.out.println("Invalid choice");	
					
			}
			System.out.println("want to change permissions");
		}
		while(sc.nextBoolean());
		
		/*//wrapper class
		int numberOfTabs=allBrowsers.size();
		Integer numberOfTabsobj=numberOfTabs; //autoboxing
		
		System.out.println("integer object number of tabs : "+numberOfTabsobj);
		
		int  numberOfTab=numberOfTabsobj;  //unboxing
		System.out.println("int value number of tabs : "+numberOfTab);*/
		
	}
	
}