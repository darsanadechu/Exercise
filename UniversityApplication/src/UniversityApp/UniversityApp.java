package UniversityApp;
import java.util.*;



public class UniversityApp
{
	
	public static void main(String[] arg)
	{
		University university=new University();
		Course course1=new Course("c1","ise",0.0);
		university.courseList.add(course1);
		Course course2=new Course("c2","maa",4.0);
		university.courseList.add(course2);
		Course course3=new Course("c3","ml",4.0);
		university.courseList.add(course3);
		int choice;
		boolean more;
		do
		{
			System.out.println("1 : Add");
			System.out.println("2 : Delete");
			System.out.println("3 : Update");
			System.out.println("4 : Print");
			System.out.println("5 : Search");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: university.add();
						break;
				case 2: university.delete();
						break;
				case 3: university.update();
						break;
				case 4: university.print();
						break;
				case 5: university.search();
				        break;
				default : System.out.println("Invalid choice");
			}
			System.out.println("need more");
			more=sc.nextBoolean();
		}while(more);
		
		
	}

}
