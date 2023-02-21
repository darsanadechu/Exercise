package UniversityApp;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//sub class student
public class Student extends Person
{
	private int studentId;
	private double studentCGPA;
	ArrayList<String> studentCourse=new ArrayList<>();
	
	Student()
	{
	}
	
	@Override public void addDetails()
	{
		Course course=new Course();
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id :");
		studentId=sc.nextInt();
		super.addDetails();
		System.out.println("Enter CGPA:");
		studentCGPA=sc.nextDouble();
		
		System.out.println("want to register course");
		if(sc.nextBoolean())
		{
			System.out.println("Enter number of courses to be registered");
			int n=sc.nextInt();
			System.out.println("Enter courses names : ");
			for(int i=1;i<=n;i++)
			{
				String courseName=sc.next();
				for(Course course1:university.courseList)
					if(Objects.equals(courseName, course1.getCourseTitle()))
					{
						studentCourse.add(courseName);
						course.studentsEnrolled.add(course1.getCourseTitle());
						flag++;
					}
				if(flag==0)		
					System.out.println("course not found ");
						
			}
		}
	}
	
	void displayStudentCourse()
	{
		System.out.println("Courses :");
		for(String str:studentCourse)
			System.out.println(str);
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public double getStudentCgpa()
	{
		return studentCGPA;
	}
	
}

