package stringBufferClass;
import java.util.StringTokenizer;

public class StringBufferClass 
{
	
	public static void main(String[] arg)
	{
		//mutable string 
		StringBuffer string1=new StringBuffer("Darsana");
		StringBuffer string2=new StringBuffer(" Sabu ");

		//concatenation
		string1.append(string2);
		System.out.println("concatenated  :"+string1);
		
		//insert
		string1.insert(13,"22");
		System.out.println("updated :"+string1);
		
		
		//delete
		string1.delete(7, 12);
		System.out.println("updated :"+string1);
		
		///replace
		string1.replace(8, 10, "2023");
		System.out.println("updated :"+string1);
		
		//reverse
		System.out.println("reverse: "+string1.reverse());
		
		System.out.println("capacity of string1 : "+string1.capacity());
		System.out.println();
		
		//stringTokenizer 
		String str="I am Darsana from Thodupuzha";
		StringTokenizer s=new StringTokenizer(str," ");
		System.out.println(str);
		System.out.println("no of tokens in string : "+s.countTokens());
		System.out.println("tokens are :");
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}
		
	}

}
