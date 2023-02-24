package wrapperClass;
import java.util.*;

public class WrapperClass {

	public static void main(String[] arg)
	{
		int i=10;
		int k=5;
		
		//explicit converting integer to object
		Integer intObject=Integer.valueOf(i);
		System.out.println("Integer object : "+intObject);
		
		//autoboxing
		Integer integerObject=k;
		System.out.println("Integer object : "+integerObject);
		
		//unboxing
		Integer a=20;
		int intValue=a;
		System.out.println("Integer value : "+intValue);
		
		//arraylist stores values as object
		ArrayList<Integer> numberList=new ArrayList<>();
		numberList.add(1);  //autoboxing
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		
		int value=numberList.get(3); //unboxing
		System.out.println("element at index 3 : "+value);
	}
}