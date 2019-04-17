package ooad_ebys;

import java.util.ArrayList;
import java.util.Scanner;

public class ooad {
	static ArrayList<courses> CourseList=new ArrayList<courses>();
	static ArrayList<students> StudentList=new ArrayList<students>();
	static ArrayList<instructors> ProfList=new ArrayList<instructors>();
	
	public static String areYouProfOrStudent()
	{
		System.out.println("are You Prof or Student ? (p for prof, s for student):");
		Scanner input = new Scanner(System.in);
		String answer=input.nextLine();	
		return answer;	
	}
	
	public static String login()
	{
		System.out.println("Login Your Name:(You must to write first letter uppercase exp:Yetkin)");
		Scanner input = new Scanner(System.in);
		String name=input.nextLine();	
		System.out.println("Welcome "+name);
		return name;
	}
	
	public static void LookCourseList(ArrayList<courses> list )
	{
		for(int i=0; i<list.size(); i++)
			System.out.println((i+1)+"."+(list.get(i)).toString());	
	}
	
	public static void ChooseCourse(int i,int point)
	{
		StudentList.get((point)).addChoosenCourse(CourseList.get(i-1));
		CourseList.get(i-1).addEnrolledCourse(StudentList.get(point));
		System.out.println("Course has added succesfull");	
	}
	
	public static int getFromStudentName(String name)
	{ 
		String name2=null;
		int Point=0;
			for(int i=0; i<StudentList.size();i++) {
				name2=StudentList.get(i).getName();
				if(name2.equals(name))   
					Point=i;
			}	
		return Point;	
	}
	
	public static int getFromProfName(String name)
	{ 
		String name2;
		int Point=0;
		for(int i=0; i<ProfList.size();i++) {
			name2=ProfList.get(i).getName();
			if(name2.equals(name))
				Point=i;
		}
		return Point;		
	}
	
	public static void PrintAllChoosenCourses(int point)
	{	
		StudentList.get((point)).PrintAllChoosenCourses();
	}
	
	public static void menu()
	{
		System.out.println("What do you want to do ?");	
		System.out.println("1.Look at  Courses");
		System.out.println("2.Enroll Course");
		System.out.println("3.Look at Choosen Courses");
		System.out.println("4.Exit");
	}
	
	public static void menu2()
	{
		System.out.println("What do you want to do ?");	
		System.out.println("1.Look at Given Courses");
		System.out.println("2.Choose Course for Entry Grade");
		System.out.println("3. Look at Students grades");
		System.out.println("4.Exit");		
	}
	
	public static void EnteringGrade(int midTerm,int finalGrade ,int Project,int i)
	{
		StudentList.get((i-1)).setFinalGrade(finalGrade);
		StudentList.get((i-1)).setMidTerm(midTerm);
		StudentList.get((i-1)).setProject(Project);	
	}
	
	public static void ChoosenCourseStudents(int i,int point)
	{
	    ProfList.get(point).givenCourses.get((i)).PrintEnrolledStudents();	
	}
	
	public static void GivenCourses(int point)
	{
		ProfList.get(point).PrintAllGivenCourses();
	}
	
	public static void main(String[] args) 
	{
		while(true) {
			String answer=areYouProfOrStudent();
			if(answer.equals("s")) {   			 
				String name=login();
				StudentHandler(name);
			}
			
			if(answer.equals("p")) {    
				String name=login();
				ProfHandler(name);	
			}
		}
	}
	
	public static void StudentHandler(String name)
	{
		CourseList.add(new courses("Algorithms",5,"Tuesday"));
		CourseList.add(new courses("Graphics",5,"Monday"));
		CourseList.add(new courses("Ooad",5,"Friday"));
		CourseList.add(new courses("Server Techs",5,"Wednesday"));
		CourseList.add(new courses("Micro Controller",5,"Thursday"));
		StudentList.add(new students("Yetkin"));
		StudentList.add(new students("Yunus"));
		StudentList.add(new students("Mehmet"));
		StudentList.add(new students("Mahmut"));
		StudentList.add(new students("Alper"));
		int point=getFromStudentName(name);
		boolean Switcher=true;
		
		while(Switcher) {
			menu();
		
			Scanner input = new Scanner(System.in);
			String answer=input.nextLine();
		
			switch(answer) {
			
			case "1": 
				LookCourseList(CourseList );
				break;
			case "2": 
				LookCourseList(CourseList );
				System.out.println("Please press number of the course that you want to add");
				Scanner input2 = new Scanner(System.in);
				int answer2= input2.nextInt();
				ChooseCourse( answer2,point);
				break;	
			case "3":	
				PrintAllChoosenCourses(point);
				break;
		
			case "4": 
				Switcher=false; 
				break;
			}
		}

	}
	
	public static void ProfHandler(String name) 
	{
		StudentList.add(new students("Yetkin",0));
		StudentList.add(new students("Yunus",1));
		StudentList.add(new students("Mehmet",2));
		StudentList.add(new students("Mahmut",3));
		StudentList.add(new students("Alper",4));
		
		CourseList.add(new courses("Algorithms",5,"Tuesday",0));
		CourseList.add(new courses("Graphics",5,"Monday",1));
		CourseList.add(new courses("Ooad",5,"Friday",2));
		CourseList.add(new courses("Server Techs",5,"Wednesday",3));
		CourseList.add(new courses("Micro Controller",5,"Thursday",4));
	
		ProfList.add(new instructors("Ali"));
		ProfList.get(0).givenCourses.add(CourseList.get(0));
		
		ProfList.add(new instructors("Veli"));
		ProfList.get(1).givenCourses.add(CourseList.get(1));
	
		ProfList.add(new instructors("Mehmet"));
		ProfList.get(2).givenCourses.add(CourseList.get(2));
	
		ProfList.add(new instructors("Mesut"));
		ProfList.get(3).givenCourses.add(CourseList.get(3));
		
		ProfList.add(new instructors("Okan"));
		ProfList.get(4).givenCourses.add(CourseList.get(4));
		
		CourseList.get(0).addEnrolledCourse(StudentList.get(0));
		CourseList.get(0).addEnrolledCourse(StudentList.get(1));
		CourseList.get(1).addEnrolledCourse(StudentList.get(3));
		CourseList.get(2).addEnrolledCourse(StudentList.get(4));
		CourseList.get(2).addEnrolledCourse(StudentList.get(2));
		CourseList.get(3).addEnrolledCourse(StudentList.get(0));
		CourseList.get(3).addEnrolledCourse(StudentList.get(1));
		CourseList.get(4).addEnrolledCourse(StudentList.get(0));
		CourseList.get(4).addEnrolledCourse(StudentList.get(1));
		CourseList.get(0).addEnrolledCourse(StudentList.get(2));
		CourseList.get(0).addEnrolledCourse(StudentList.get(3));
		CourseList.get(0).addEnrolledCourse(StudentList.get(4));
		
		int point=getFromProfName(name);
		
		boolean Switcher=true;
		while(Switcher) {
			menu2();
			
			Scanner input = new Scanner(System.in);
			String answer=input.nextLine();
			
			switch(answer) {  
			
			case "1": 
				GivenCourses( point);
				break;
			case "2": 
				 GivenCourses( point);
				 System.out.println("Please press number of the course that you want to see(write number)");
				 Scanner input2 = new Scanner(System.in);
				 int answer2= input2.nextInt();
				 ChoosenCourseStudents(answer2, point);
				 System.out.println("Please choose student for entry grade(write  number)p");
				 Scanner input3 = new Scanner(System.in);
				 int answer3= input3.nextInt();
			    
				 System.out.println("Please enter midTerm");
				 Scanner input4 = new Scanner(System.in);
				 int answer4= input4.nextInt();
				 System.out.println("Please enter Final");
				 Scanner input5 = new Scanner(System.in);
				 int answer5= input5.nextInt();
				 System.out.println("Please enter Project");
				 Scanner input6 = new Scanner(System.in);
				 int answer6= input6.nextInt();
				 EnteringGrade( answer4, answer5 , answer6,answer3);
				 break;	
			case "3":	
				GivenCourses( point);
				System.out.println("Please press number of the course that you want to see(write first number)");
				Scanner input9 = new Scanner(System.in);
				int answer9= input9.nextInt();
				ChoosenCourseStudents(answer9, point);
				 break;
			
			case "4": 
				Switcher=false; 
				break;
			}	
		}
	}

}
