package BrowsersApp;
import java.util.ArrayList;

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
	
	Browser()
	{
		
	}
	
	void whoAmI()
	{
		System.out.println("I am a browser");
	}
}

//sub class google chrome
class GoogleChrome extends Browser
{
	
	static double versionNumber=1.0;
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
		ArrayList<Browser> allBrowsers=new ArrayList<Browser>();
		Browser tabOne=new GoogleChrome();
		tabOne.whoAmI();
		((GoogleChrome) tabOne).setPermissions(true);
		((GoogleChrome) tabOne).viewPermissions();
		((GoogleChrome) tabOne).setPermissions(false,true,false);
		((GoogleChrome) tabOne).viewPermissions();
		allBrowsers.add(tabOne);
		
		Browser tabTwo=new Firefox();
		tabTwo.whoAmI();
		allBrowsers.add(tabTwo);
		
		Browser tabThree=new GoogleChrome();
		allBrowsers.add(tabThree);
		
		for(Browser B:allBrowsers)
			if(B instanceof GoogleChrome)
				countChrome++;
		System.out.println("Google chrome browsers availabe : "+countChrome);
		System.out.println();
		
		//multiple account containers
		MultipleAccountContainers browser=new Firefox();
		browser.addContainer("facebookContainer");
		browser.addContainer("Mails");
		browser.addContainer("PrivateBrowsing");
		
		browser.viewAllContainers();
		
		browser.leaveContainer("PrivateBrowsing");
		
		browser.viewAllContainers();
		
		//wrapper class
		int numberOfTabs=allBrowsers.size();
		Integer numberOfTabsobj=numberOfTabs; //autoboxing
		
		System.out.println("integer object number of tabs : "+numberOfTabsobj);
		
		int  numberOfTab=numberOfTabsobj;  //unboxing
		System.out.println("int value number of tabs : "+numberOfTab);
		
	}
	
}