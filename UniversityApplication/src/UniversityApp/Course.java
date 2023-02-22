package UniversityApp;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//class course
class Course 
{
	University university1=new University();
	private String courseId, courseTitle;
	private double credit;
	private int numberOfStudents;
	public ArrayList<String> studentsEnrolled=new ArrayList<>();
	Faculty faculty;
	Scanner sc=new Scanner(System.in);
	
	Course()
	{
		
	}
	
	public Course(String id, String title, double d) {
		this.courseId=id;
		this.courseTitle=title;
		this.credit=d;
	}

	public void addCourse()
	{
		int flag=0;
		System.out.println("Enter course id: ");
		this.courseId=sc.next();
		for(Course c:university1.courseList)
		System.out.println("Enter course title :");
		this.courseTitle=sc.next();
		System.out.println("Enter course credits: ");
		this.credit=sc.nextDouble();
		
		//add student
		System.out.println("want to add student");
		if(sc.nextBoolean())
		{
			System.out.println("Enter number of students enrolled");
			numberOfStudents=sc.nextInt();
			System.out.println("Enter students :");
			for(int i=1;i<=numberOfStudents;i++)
			{
				for(Student s:university1.studentList)
				{
					String str=sc.next();
					if(Objects.equals(str, s.getName()))
					{
						flag++;
						studentsEnrolled.add(str);
					}
				}
				if(flag==0)
					System.out.println("student not found");
			}
		}
		
		
		//to add faculty
		System.out.println("want to add faculty");
		if(sc.nextBoolean())
		{
			System.out.println("Enter faculty :");
			faculty=new Faculty();
			faculty.addDetails();
			for(Faculty faculty1:university1.facultyList)
				if(Objects.equals(faculty1.getName(),faculty.getName()))
					flag=1;
			if(flag==0)
				university1.facultyList.add(faculty);
		}
		
				
	}
	public String getCourseId()
	{
		return courseId;
	}
	
	public String getCourseTitle()
	{
		return courseTitle;
	}
	
	public double getCourseCredit()
	{
		return credit;
	}
	
	public int getStudentNumber()
	{
		return numberOfStudents;
	}
	public void setCourseCredit(double credit1)
	{
		credit=credit1;
	}
	void dropFaculty()
	{
	
		faculty=null;
	}
	void dropStudent()
	{
		System.out.println("Enter name of student to be dropped");
		String str1=sc.next();
		for(String str:studentsEnrolled)
			studentsEnrolled.remove(str1);
	}
}

