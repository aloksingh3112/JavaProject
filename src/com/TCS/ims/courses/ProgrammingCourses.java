package com.TCS.ims.courses;

import com.TCS.ims.CommonCourses.Course;



public class ProgrammingCourses extends Course {
	public String courses[];
	public int id;
	
	public ProgrammingCourses() {
		id = 100;
		String courses[]= { "c","c++","java"};
		this.courses=courses;
		
	}
	  public void print(){
		int id = 1;
		System.out.println("Parent Id "+super.id+" Current Object ID "+this.id+" Local Id "+id);
		System.out.println("Name is "+super.name);
		System.out.println("Programming Courses are ::");
		for(String course: courses){
			System.out.println(course);
		}
	}
}
