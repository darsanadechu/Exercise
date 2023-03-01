package BrowsersApp;

//sub class google chrome
public class GoogleChrome extends Browser
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
