package UniversityApp;
import java.util.Scanner;

//parent class person
public class Person
{
	University university=new University();
	private String name;
	private String email; 
	
	Person()
	{
	}
	
	public void addDetails()
	{
		System.out.println("Enter name :");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter email :");
		email=sc.next();
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email1)
	{
		email=email1;
	}
}

