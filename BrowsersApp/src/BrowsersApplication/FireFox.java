package BrowsersApplication;

import java.util.ArrayList;

//sub class fire fox and implements interface
public class FireFox extends Browser implements MultipleAccountContainers
{
	
	ArrayList<String> containers=new ArrayList<>();
	FireFox()
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
