package distinctCharacter;
import java.util.Scanner;


public class DistinctCharacter 
{
	public static void main(String[] arg)
	{
		StringBuilder string = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		string.append(sc.next());
		int index=0;
		for(int i=0;i<string.length();i++)
		{
			int count=1;
			char ch=string.charAt(i);
			for(int j=i+1;j<string.length();j++)
			{
				if((Character.compare(ch, string.charAt(j)))==0)
					count++;
			}
			for(int k=1;k<count;k++)
			{
				index=string.lastIndexOf(String.valueOf(ch));
				string.delete(index,index+1);
			}
		}
		System.out.println("distinct characters in string :");
		System.out.println(string);
	}
}
