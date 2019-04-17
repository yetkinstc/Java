package ooad_ebys;

import java.util.ArrayList;

public class students {
	public String name;
	public int midTerm;
	public int finalGrade;
	public int project;
	public int number;
	
	public ArrayList<courses> ChosenCourses=new ArrayList<>();
	
	public students(String name,int number) 
	{
		this.name=name;
		this.number=number;
	}
	
	@Override
	public String toString() 
	{
		return "students [name=" + name + ", midTerm=" + midTerm + ", finalGrade=" + finalGrade + ", project=" + project
				+ ", number=" + number  + "]";
	}


	public ArrayList<courses> getChoosenCourses() 
	{
		return ChosenCourses;
	}
	
	public void setChoosenCourses(ArrayList<courses> choosenCourses) 
	{
		ChosenCourses = choosenCourses;
	}
	
	public void addChoosenCourse(courses Course)
	{
		ChosenCourses.add(Course);
	}
	
	public students(String name, int midTerm ,int finalGrade)
	{
		this.name=name;
		this.midTerm=midTerm;
		this.finalGrade=finalGrade;
	}
	
	public students(String name, int midTerm ,int finalGrade,int project,int number)
	{
		this.name=name;
		this.midTerm=midTerm;
		this.finalGrade=finalGrade;
		this.number=number;
		this.project=project;
	}
	
	public students()
	{
	
	}
	
	public students(String name, int midTerm ,int finalGrade,int project)
	{
		this.name=name;
		this.midTerm=midTerm;
		this.finalGrade=finalGrade;
		this.project=project;
	}
	
	public students(String name)
	{
		this.name=name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getMidTerm() 
	{
		return midTerm;
	}
	
	public void setMidTerm(int midTerm) 
	{
		this.midTerm = midTerm;
	}
	
	public int getFinalGrade() 
	{
		return finalGrade;
	}
	
	public void setFinalGrade(int finalGrade) 
	{
		this.finalGrade = finalGrade;
	}
	
	public int getProject() 
	{
		return project;
	}
	
	public void setProject(int project) 
	{
		this.project = project;
	}
	
	public void ShowTheChoosenCourses()
	{
		int size=ChosenCourses.size();
		for(int i=0; i<size; i++)
			System.out.println(ChosenCourses.get(i));
	}
	
	public void PrintAllChoosenCourses()
	{
		for(int i=0; i<ChosenCourses.size();i++)
			System.out.println(ChosenCourses.get(i).toString());
	}
	
}
