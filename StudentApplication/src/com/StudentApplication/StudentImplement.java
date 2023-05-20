package com.StudentApplication;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class StudentImplement implements StudentInterface{
	Connection con;
	@Override
	public void createStudent(Student stu) {
		// TODO Auto-generated method stub
		//first to get the connection to our database we have our db connection class so call it
		con=DBConnection.createDBConnection();
		String query="insert into student values(?,?,?,?,?);";
		try {
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setInt(1, stu.getId());
		pstm.setString(2, stu.getName());
		pstm.setDouble(3, stu.getPhoneNumber());
		pstm.setInt(4, stu.getAge());
		pstm.setInt(5, stu.getCourseId());
		int cnt=pstm.executeUpdate();
		if(cnt!=0)
			System.out.println("Student Registered Successfully!!!");
		}catch(Exception ex) {
			System.out.println("The id is primary and must be unique");
			ex.printStackTrace();
		}
		}

	@Override
//	public void showAllStudent() {
//	    con = DBConnection.createDBConnection();
//	    String query = "SELECT s.id, s.name, s.phoneNumber, s.age, c.name FROM student s JOIN course c ON s.courseId = c.courseid";
//	    try {
//	        Statement stmt = con.createStatement();
//	        ResultSet result = stmt.executeQuery(query);
//	        while (result.next()) {
//	            int id = result.getInt(1);
//	            String name = result.getString(2);
//	            long phoneNumber = result.getLong(3);
//	            int age = result.getInt(4);
//	            String courseName = result.getString(5);
//	            System.out.format("%-5d %-20s %-16d %-8d %-4s\n", id, name, phoneNumber, age, courseName);
//	        }
//	    } catch (Exception ex) {
//	        ex.printStackTrace();
//	    }
//	}
	public void showAllStudent() {
	    con = DBConnection.createDBConnection();
	    String query = "SELECT s.id, s.name, s.phoneNumber, s.age, c.name FROM student s JOIN course c ON s.courseId = c.courseid";
	    try {
	        Statement stmt = con.createStatement();
	        ResultSet result = stmt.executeQuery(query);
	        while (result.next()) {
	            int id = result.getInt(1);
	            String name = result.getString(2);
	            long phoneNumber = result.getLong(3);
	            int age = result.getInt(4);
	            String courseName = result.getString(5);

	            // create a set to store the course names and add the actual course name
	            Set<String> courseNames = new HashSet<String>();
	            courseNames.add(courseName);

	            // add 4 unique random course names to the set
	            String[] randomCourseNames = {"C++", "Python", "DBMS", "AI"};
	            Random rand = new Random();
	            while (courseNames.size() < 5) {
	                int index = rand.nextInt(randomCourseNames.length);
	                courseNames.add(randomCourseNames[index]);
	            }

	            // print the row with all 5 course names
	            System.out.format("%-5d %-20s %-16d %-8d", id, name, phoneNumber, age);
	            for (String course : courseNames) {
	                System.out.format(" %-18s", course);
	            }
	            System.out.println();
	        }
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}





	@Override
	public void showStudentBasedOnID(int id) {
		// TODO Auto-generated method stub
		con=DBConnection.createDBConnection();
		String query="select * from student where id="+id;
		try {
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			
			while(result.next()) {
			    id = result.getInt(1);
			    String name = result.getString(2);
			    long phoneNumber = result.getLong(3);
			    int age = result.getInt(4);
			    int courseId=result.getInt(5);
			    System.out.format("%-5d %-20s %-16d %-8d %-4d\n", id, name, phoneNumber, age,courseId);
			}//if we have anything in this result the loop will execute
		}
			
		catch(Exception ex) {
			System.out.println("No such id ");
			ex.printStackTrace();
		}
	}

	@Override
	public void updateStudent(int id, String name) {
		// TODO Auto-generated method stub
		con=DBConnection.createDBConnection();
		String query="update student set name=? where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setString(1,name);
			pstm.setInt(2, id);
		int cnt=pstm.executeUpdate();
		if(cnt!=0)
			System.out.println("Student Updated Successfully !!");
		}
		catch(Exception ex) {
			System.out.println("No such id");
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		con=DBConnection.createDBConnection();
		String query="delete from student where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1, id);
		int cnt=pstm.executeUpdate();
		if(cnt!=0)
			System.out.println("Successfully deleted");
		}
		catch(Exception ex)
		{
			System.out.println("No such id");
			ex.printStackTrace();
		}
	}

}