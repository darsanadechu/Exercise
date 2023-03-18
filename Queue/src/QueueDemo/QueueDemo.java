package QueueDemo;
import java.util.*;

class Student implements Comparable<Student>
{

	int rank;
	String name;
	float score;
	
	Student(int rank,String name,float score)
	{
		this.rank = rank;
		this.name = name;
		this.score = score;
	}


	public int compareTo(Student s)
	{
		
		if(rank>s.rank)
			return 1;
		else if(rank<s.rank)
			return -1;
		else
			return 0;
	}
}

public class QueueDemo {

	public static void main(String[] arg)
	{
		
		PriorityQueue<Student> studentQueue = new PriorityQueue<>();
		
		Student s1 = new Student(3,"Vinu",75);
		Student s2 = new Student(2,"Manu",80);
		Student s3 = new Student(4,"Anu",60);
		Student s4 = new Student(1,"Malu",95);
		
		studentQueue.add(s1);
		studentQueue.add(s2);
		studentQueue.add(s3);
		studentQueue.add(s4);
		
		
		System.out.println("Student Queue :");
		Iterator<Student> itr = studentQueue.iterator();
		while(itr.hasNext())
		{
			Student s = itr.next();
			System.out.println(s.rank+" "+s.name+" "+s.score);
		}
		
		
		Student S = studentQueue.element();
		System.out.println("Topper : "+S.name);
		
		System.out.println("removing topper from ranklist :");
		studentQueue.remove();
		Iterator<Student> i = studentQueue.iterator();
		while(i.hasNext())
		{
			Student s = i.next();
			System.out.println(s.rank+" "+s.name+" "+s.score);
		}
		
		
	}
}
