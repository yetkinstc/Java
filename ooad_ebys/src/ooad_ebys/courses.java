package ooad_ebys;

import java.util.ArrayList;

public class courses {
	
	public String name;
	public int credit;
	public String date;
	public int number;
	
	public ArrayList<students> EnrolledStudents =new ArrayList<students>();
	@Override
	public String toString() 
	{
		return "courses [name=" + name + ", credit=" + credit + ", date=" + date + "]";
	}
	
	public courses()
	{
	
	}

	public courses(String name, int credit,String date)
	{
		this.name=name;
		this.credit=credit;
		this.date=date;
	}
	
	public courses(String name, int credit,String date,int number)
	{
		this.name=name;
		this.credit=credit;
		this.date=date;
		this.number=number;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getCredit() 
	{
		return credit;
	}

	public void setCredit(int credit) 
	{
		this.credit = credit;
	}

	public String getDate() 
	{
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}

	public void addEnrolledCourse(students student)
	{
		EnrolledStudents.add(student);
	}
	
	public void PrintEnrolledStudents()
	{
	  for(int i=0; i<EnrolledStudents.size();i++)
		  System.out.println((EnrolledStudents.get(i).number+1)+EnrolledStudents.get(i).toString());
	}
	
}
