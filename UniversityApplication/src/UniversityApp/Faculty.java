package UniversityApp;

import java.util.Objects;
import java.util.Scanner;

//subclass faculty
public class Faculty extends Person
{
	private int facultyId;
	private String facultyPosition;
	Course Course1;
	Scanner sc=new Scanner(System.in);
	Faculty()
	{
		
	}
	@Override public void addDetails()
	{
		System.out.println("Enter faculty id :");
		this.facultyId=sc.nextInt();
		super.addDetails();
		System.out.println("Enter faculty position :");
		this.facultyPosition=sc.next();
	}
	void addFacultyCourse()
	{
		int flag=0;
		System.out.println("Enter course taken :");
		String courseName=sc.next();
		for(Course course:university.courseList)
			if(Objects.equals(courseName, course.getCourseTitle()))
			{
				Course1=course;
				flag++;
			}
		if(flag==0)
			System.out.println("course not found ");
	}
	public int getFacultyId()
	{
		return facultyId;
	}

	public String getFacultyPosition()
	{
		return facultyPosition;
	}
	
	public void setFacultyPosition(String position)
	{
		facultyPosition=position;
	}

}


