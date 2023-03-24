package JavaCollections;
import java.util.Iterator;
import java.util.PriorityQueue;


class StudentDetails implements Comparable<StudentDetails>
{

	int rank;
	String name;
	float score;
	
	StudentDetails(int rank,String name,float score)
	{
		this.rank = rank;
		this.name = name;
		this.score = score;
	}


	public int compareTo(StudentDetails s)
	{
		
		if(rank>s.rank)
			return 1;
		else if(rank<s.rank)
			return -1;
		else
			return 0;
	}
	
	public String toString()
	{
		return rank+" "+name+" "+score;
	}
}

public class QueueDemo {

	public static void main(String[] arg)
	{
		
		PriorityQueue<StudentDetails> studentQueue = new PriorityQueue<>();
		
		StudentDetails s1 = new StudentDetails(3,"Vinu",75);
		StudentDetails s2 = new StudentDetails(2,"Manu",80);
		StudentDetails s3 = new StudentDetails(4,"Anu",60);
		StudentDetails s4 = new StudentDetails(1,"Malu",95);
		
		studentQueue.add(s1);
		studentQueue.add(s2);
		studentQueue.add(s3);
		studentQueue.add(s4);
		
		
		System.out.println("Student Queue :");
		Iterator<StudentDetails> itr = studentQueue.iterator();
		while(itr.hasNext())
		{
			StudentDetails s = itr.next();
			System.out.println(s.toString());
		}
		
		
		StudentDetails S = studentQueue.element();
		System.out.println("Topper : "+S.name);
		
		System.out.println("removing topper from ranklist :");
		studentQueue.remove();
		Iterator<StudentDetails> i = studentQueue.iterator();
		while(i.hasNext())
		{
			StudentDetails s = i.next();
			System.out.println(s.toString());
		}
		
		
	}
}