package stringOperations;

public class StringOperations 
{

	public static void main(String[] arg)
	{
		
		String string1="Darsana";
		String string2=" Sabu";
		
		System.out.println("length of string \"Darsana\" : "+string1.length());
		//concatenation using + operator
		System.out.println("full name :"+string1+string2);
		
		string1.concat(string2);
		System.out.println(string1); //strings are immutable
		
		//concatenation using concat() function
		string1=string1.concat(string2); //creates another object
		System.out.println("using concat() method :"+string1);
		
		//using append() method
		StringBuilder string3=new StringBuilder("Darsana");
		StringBuilder string4=new StringBuilder(" Sabu");
		System.out.println("using append() method :"+string3.append(string4));
		
		//comparison
		String s1="darsana";
		String s2="Darsana";
		String s3="Sabu";
		//using equals() method
		System.out.println("is s1 equals to s2 :"+s1.equals(s2));
		System.out.println("is s1 equals to s2 ignoring case:"+s1.equalsIgnoreCase(s2));
		//using compareTo() method
		int value=s2.compareTo(s3);
		if(value==0)
			System.out.println("s2 equals to s3");
		else if(value>0)
			System.out.println("s2 greater than s3");
		else
			System.out.println("s2 less than s3");
		
		//substring
		System.out.println("substring of darsana with index 3 :"+s1.substring(3));
		System.out.println("substring of darsana with index 1 to 7:"+s1.substring(1,6));
	}
}
