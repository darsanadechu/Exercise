package test;
import java.util.Iterator;
import java.util.LinkedList;

class Student

{
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
}



public class Test {
	
	public static void main(String[] arg)
	{
		
		Student s1 = new Student(1,"A");
		Student s2 = new Student(2,"B");
		
		LinkedList<Student> slist = new LinkedList<>();
		slist.add(s1);
		slist.add(s2);
		
		Iterator<Student> i = slist.iterator();
		
		while(i.hasNext())
		{
			Student s = i.next();
			System.out.println(s.rollno+" "+s.name);
		}
		
		//for(Student s:slist)
		//	System.out.println(s.rollno+" "+s.name);
	}
}
