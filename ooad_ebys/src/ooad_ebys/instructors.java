package ooad_ebys;

import java.util.ArrayList;

public class instructors {
	
	public String name;
	public ArrayList<courses> givenCourses=new ArrayList<>();
	
	public String getName() 
	{
		return name;
	}

	public instructors(String name) 
	{
		this.name=name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public void PrintAllGivenCourses() 
	{
		for(int i=0; i<givenCourses.size();i++)	
			System.out.println(i+".)"+"Course number="+givenCourses.get(i).number+"."+givenCourses.get(i).toString());
	}

	public ArrayList<courses> getGivenCourses() 
	{
		return givenCourses;
	}

	public void setGivenCourses(ArrayList<courses> givenCourses) 
	{
		this.givenCourses = givenCourses;
	}

}
