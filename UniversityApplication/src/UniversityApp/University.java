package UniversityApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

//university class
class University
{
	//student arraylist
	public static ArrayList<Student> studentList=new ArrayList<Student>();
	//faculty arraylist
	public static ArrayList<Faculty> facultyList=new ArrayList<Faculty>();
	//course arraylist
	public static ArrayList<Course> courseList=new ArrayList<Course>();
	
	
	
	University()
	{
	}
	
	//function for add
	void add()
	{
		Course course=new Course();
		int addChoice;
		System.out.println("1 : Add a student");
		System.out.println("2 : Add a faculty");
		System.out.println("3 : Add a course");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice for add");
		addChoice=sc.nextInt();
		switch(addChoice)
		{
		case 1: //add a student
				Student Student1 = new Student();
				Student1.addDetails();
				studentList.add(Student1);
				break;
		case 2: //add a faculty
				Faculty Faculty1=new Faculty();
				Faculty1.addDetails();
				Faculty1.addFacultyCourse();
				course.faculty=Faculty1;
				facultyList.add(Faculty1);
				break;
		case 3:	//add a course
				Course Course1=new Course();
				Course1.addCourse();
				courseList.add(Course1);
				break;
		
		}
	}
	
	//function for delete
	void delete()
	{
		int deleteChoice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Delete a student");
		System.out.println("2 : Delete a faculty");
		System.out.println("3 : Delete a course");
		System.out.println("Make your choice");
		deleteChoice = sc.nextInt();
		switch(deleteChoice) 
		{
			
		case 1: //Delete a student
				Iterator i=studentList.iterator();
				System.out.println("Enter the Id of the student to be deleted");
				int studId =sc.nextInt();
				while(i.hasNext())
				{
					if(((Student) i.next()).getStudentId()==studId) {
						i.remove();;
					}
				}
				break;
		
		case 2:	//Delete a faculty
				Iterator i1=facultyList.iterator();
				System.out.println("Enter the Id of the faculty to be deleted");
				int facId =sc.nextInt();
				while(i1.hasNext())
				{
					if(((Faculty) i1.next()).getFacultyId()==facId) {
						i1.remove();
					}
				}
				break;
				
		case 3: //Delete a course
				Iterator i2=courseList.iterator();
				System.out.println("Enter the Id of the course to be deleted");
				String crId =sc.next();
				while(i2.hasNext())
				{
					if(Objects.equals(crId, ((Course) i2.next()).getCourseId())) {
						i2.remove();
					}
				}
				break;
				
		default : System.out.println("Invalid choice");
				
		}
	}
	
	//update function
	void update()
	{
		Course course=new Course();
		int updateChoice;
		System.out.println("1 : Update a student");
		System.out.println("2 : Update a faculty");
		System.out.println("3 : Update a course");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice for update");
		updateChoice=sc.nextInt();
		switch(updateChoice)
		{
		
			case 1: //update student details
					int updateStudentChoice;
					System.out.println("Enter id of student to be updated :");
					int studId=sc.nextInt();
					System.out.println("1 : Update student cgpa");
					System.out.println("2 : Update student email");
					System.out.println("3 : register a course");
					System.out.println("4 : Drop a course");
					System.out.println("Enter choice ");
					updateStudentChoice=sc.nextInt();
					
					for(Student s: studentList)
					{
						if(s.getStudentId()==studId) 
						{
							switch(updateStudentChoice)
							{
							
							case 1: System.out.println("Enter new cgpa of student :");
									s.setStudentCgpa(sc.nextDouble());
									break;
							case 2: System.out.println("Enter new email of student :");
									s.setEmail(sc.next());
									break;
							case 3: System.out.println("Enter name of course to be registerd :");
									s.registerCourse(sc.next());
									break;
							case 4: System.out.println("Enter name of course to be dropped :");
									s.dropCourse(sc.next());
									break;
							default : System.out.println("Invalid choice");
							}
						}
					}
					
					break;
			case 2:	//update faculty details
					int updateFacultyChoice;
					System.out.println("Enter the Id of the faculty to be updated");
					int facId =sc.nextInt();
					System.out.println("1 : Update faculty position");
					System.out.println("2 : Update faculty email");
					System.out.println("Enter choice ");
					updateFacultyChoice=sc.nextInt();
					for(Faculty f: facultyList)
					{
						if(f.getFacultyId()==facId) 
						{
							switch(updateFacultyChoice)
							{
						
							case 1: System.out.println("Enter new faculty position :");
									f.setFacultyPosition(sc.next());
									break;
							case 2: System.out.println("Enter new email of faculty :");
									f.setEmail(sc.next());
									break;
					
							default : System.out.println("Invalid choice");
							}
						}
					}
					break;
				
			case 3: //update course details
					int updateCourseChoice;
					System.out.println("Enter the Id of the course to be updated");
					String crId =sc.next();
					System.out.println("1 : Update course credit");
					System.out.println("2 : drop faculty");
					System.out.println("3 : drop student");
					System.out.println("Enter choice ");
					updateCourseChoice=sc.nextInt();
					for(Course c: courseList)
					{
						if(Objects.equals(crId, c.getCourseId()))
						{
							switch(updateCourseChoice)
							{
						
							case 1: System.out.println("Enter new course credit :");
									c.setCourseCredit(sc.nextDouble());
									break;
							case 2: c.dropFaculty();
									break;
							case 3: c.dropStudent();
									break;
							default : System.out.println("Invalid choice");
							}
						}
					}
					break;
			default : System.out.println("Invalid choice");
		}
	}
	
	//print function
	void print()
	{
		int printChoice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : print all students");
		System.out.println("2 : print all faculties");
		System.out.println("3 : print all courses");
		System.out.println("4 : print information of a student");
		System.out.println("5 : print information of a course");
		System.out.println("6 : print information of a faculty");
		System.out.println("7 : print student list and faculty information of a course");
		System.out.println("8 : print course taken by a student");
		System.out.println("Make your choice");
		printChoice= sc.nextInt();
		switch(printChoice)
		{
			case 1: //print all students name
					System.out.println("printing all students");
					for(Student student :studentList)
						System.out.println(student.getName());
					break;
					
			case 2: //print all faculty name
					System.out.println("printing all faculties");
					for(Faculty faculty :facultyList)
						System.out.println(faculty.getName());
					break;
					
			case 3: //print all course name
					System.out.println("printing all courses");
					for(Course course :courseList)
						System.out.println(course.getCourseTitle());
					break;	
					
			case 4: //print information of a student by student id
					System.out.println("Enter id of student information to be printed: ");
					int studId=sc.nextInt();
					for(Student student:studentList)
						if(student.getStudentId()==studId)
							displayDetails(student);
					break;
					
			case 5: //print information of a course by course id
					System.out.println("Enter id of course information to be printed: ");
					String courId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(courId, course.getCourseId()))
							displayDetails(course);
					break;
					
			case 6:  //print information of a faculty by faculty id
					System.out.println("Enter id of faculty information to be printed: ");
					int faculId=sc.nextInt();
					for(Faculty faculty:facultyList)
						if(faculty.getFacultyId()==faculId)
							displayDetails(faculty);
					break;
					
			case 7: //print student list and faculty information of a course
					System.out.println("Enter id of course which students and faculty are printed");
					String coursId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(coursId, course.getCourseId()))
						{
							System.out.println("Student list: ");
							for(String str:course.studentsEnrolled)
								System.out.println(str);
							if(!(course.faculty==null))
								displayDetails(course.faculty);
						}
					break;
					
			case 8: //print course taken by a student
					System.out.println("Enter id of student whose courses are printed");
					int studID=sc.nextInt();
					for(Student student:studentList)
						if(student.getStudentId()==studID)
							student.displayStudentCourse();
					break;
			default : System.out.println("Invalid choice");
		}
		
	}
	
	//method overloading for printing 
	void displayDetails(Student student)
	{
		System.out.println("Student details :");
		System.out.println("ID :"+student.getStudentId());
		System.out.println("Name :"+student.getName());
		System.out.println("Email :"+student.getEmail());
		System.out.println("CGPA :"+student.getStudentCgpa());
	}
	
	void displayDetails(Faculty faculty)
	{
		System.out.println("Faculty details :");
		System.out.println("ID :"+faculty.getFacultyId());
		System.out.println("Name :"+faculty.getName());
		System.out.println("Email :"+faculty.getEmail());
		System.out.println("Faculty position :"+faculty.getFacultyPosition());
	}
	
	void displayDetails(Course course)
	{
		System.out.println("Course details :");
		System.out.println("ID :"+course.getCourseId());
		System.out.println("Title :"+course.getCourseTitle());
		System.out.println("Credit :"+course.getCourseCredit());
		
	}
	
	//search function
	void search()
	{
		int searchChoice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Search a student");
		System.out.println("2 : search a coure");
		System.out.println("3 : search a faculty");
		System.out.println("4 : search whether a student takes a course");
		System.out.println("5 : search whether a faculty teaches a course");
		System.out.println("6 : search course taken by a student");
		System.out.println("7 : search course taught by a faculty");
		System.out.println("Make your choice");
		searchChoice= sc.nextInt();
		switch(searchChoice)
		{
			case 1: //search a student
					int flag1=0;
					System.out.println("Enter id of student  to be searched: ");
					int studId=sc.nextInt();
					for(Student student:studentList)
						if(student.getStudentId()==studId)
						{
							System.out.println("student found");
							displayDetails(student);
							flag1++;
						}
					if(flag1==0)
						System.out.println("student not found");
					break;
		
			case 2: //search a course
					int flag2=0;
					System.out.println("Enter id of course  to be searched: ");
					String courId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(courId, course.getCourseId()))
						{
							System.out.println("course found");
							displayDetails(course);
							flag2++;
						}
					if(flag2==0)
						System.out.println("course not found");
					break;
					
			case 3: //search a faculty
					int flag3=0;
					System.out.println("Enter id of faculty  to be searched: ");
					int faculId=sc.nextInt();
					for(Faculty faculty:facultyList)
						if(faculty.getFacultyId()==faculId)
						{
							System.out.println("faculty found");
							displayDetails(faculty);
							flag3++;
						}
					if(flag3==0)
						System.out.println("course not found");
					break;
				
			case 4://search whether a student takes a course
					int flag4=0;
					System.out.println("Enter id of course to be searched for student");
					String coursId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(coursId, course.getCourseId()))
						{
							if(!course.studentsEnrolled.isEmpty())
							{
								System.out.println("student found");
								System.out.println("Student list: ");
								for(String str:course.studentsEnrolled)
									System.out.println(str);
								flag4++;
							}
						}
					if(flag4==0)
						System.out.println("student not found");
						
					break;
					
			case 5://search whether a faculty teaches a course
					int flag5=0;
					System.out.println("Enter id of course to be searched for student");
					String courseId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(courseId, course.getCourseId()))
						{
							if(!course.faculty.equals(null))
							{
								System.out.println("faculty found");
								displayDetails(course.faculty);
								flag5++;
							}
						}
					if(flag5==0)
						System.out.println("faculty not found");
					break;
				
			case 6://search course taken by a student
					int flag6=0;
					System.out.println("Enter id of student whose courses are searched");
					int studID=sc.nextInt();
					for(Student student:studentList)
						if(student.getStudentId()==studID)
						{
							System.out.println("courses taken by student");
							student.displayStudentCourse();
							flag6++;
						}
					if(flag6==0)
						System.out.println("course not found");
					break;
			case 7://search course taught by a faculty
					int flag7=0;
					System.out.println("Enter id of course  to be searched: ");
					String couId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(couId, course.getCourseId()))
						{
							System.out.println("faculty found");
							displayDetails(course.faculty);
							flag7++;
						}
					if(flag7==0)
						System.out.println("faculty not found");
					break;
					
			default : System.out.println("Invalid choice");		
					
					
				
		}
		
		
	}
	
		
	
}





