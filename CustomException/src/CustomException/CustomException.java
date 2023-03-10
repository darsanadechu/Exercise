package CustomException;
import java.util.Scanner;


class InvalidPassword extends Exception
{
	public InvalidPassword(String errorMessage) 
	{
		
		super(errorMessage);
	}
}

class Validate
{
	void check(String password) throws InvalidPassword
	{
		String originalPassword = "PASSWORD";
		if(!originalPassword.equals(password))
		{
			throw new InvalidPassword("password is wrong");
		}
		else
		{
			System.out.println("correct password");
		}
	}
}

public class CustomException {

	public static void main(String[] arg)
	{
		
		Validate Obj = new Validate();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password");
		try
		{
			Obj.check(sc.next());
		}
		catch(InvalidPassword e) 
		{
			System.out.println(e);
			System.out.println("exception handled");
		}
	}
}
