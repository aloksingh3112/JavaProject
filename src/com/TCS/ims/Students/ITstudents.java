package com.TCS.ims.Students;

import com.TCS.ims.courses.ProgrammingCourses;

public class ITstudents {
	ProgrammingCourses programmingcourse = new ProgrammingCourses();
	public int rollno;
	public String name;
	public void ITStudents(){
		rollno =101;
		name = "RAM";
	}
	public void printDetails(){
		programmingcourse.print();
	}

}
