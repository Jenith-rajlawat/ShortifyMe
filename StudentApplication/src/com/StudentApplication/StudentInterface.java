package com.StudentApplication;

public interface StudentInterface {
	//create Student
	public void createStudent(Student stu);
	//show all Student
	public void showAllStudent();
	//show Student based on id
	public void showStudentBasedOnID(int id);
	//update the Student
	public void updateStudent(int id,String name);
	//delete Student
	public void deleteStudent(int id);
	
	
}