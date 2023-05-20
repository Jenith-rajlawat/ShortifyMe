package com.StudentApplication;
import java.util.Scanner;
import java.lang.Thread;

public class Main {
	
	public static void studentMethod() {
	    Scanner sc=new Scanner(System.in);
	    StudentImplement dao=new StudentImplement();
	    String name;
	    int id;
	    long phonenumber;
	    int age;
	    int courseId;
	    do {
	    	System.out.println("+-----+-----------------+---------------+-----+----------+");
            System.out.println("| STUDENT REGISTRATION|");
            System.out.println("+-----+-----------------+---------------+-----+----------+");
	        System.out.println("1. Add Student\n" +
	                "2. Show All Student\n" +
	                "3. Show Student based on id \n" +
	                "4. Update the Student\n" +
	                "5. Delete the Student\n" +
	                "6. Go back to MainMenu"
	               );
	        System.out.println("+-----+-----------------+---------------+-----+----------+");
	       
	        System.out.print("Enter Choice: ");
	        int ch=sc.nextInt();
	        //This is to clear the screen

	        switch(ch) {
	            case 1:
	                Student stu=new Student();
	                System.out.println("Enter ID: ");
	                id=sc.nextInt();
	                sc.nextLine();
	                System.out.println("Enter name: ");
	                name=sc.nextLine();
	                System.out.println("Enter phonenumber: ");
	                phonenumber=sc.nextLong();
	                System.out.println("Enter age: ");
	                age=sc.nextInt();
	                System.out.println("Enter courseId: ");
	                courseId=sc.nextInt();
	                stu.setId(id);
	                stu.setName(name);
	                stu.setPhoneNumber(phonenumber);
	                stu.setAge(age);
	                stu.setCourseId(courseId);
	                dao.createStudent(stu);
	                System.out.println("Student added successfully!");
	                break;
	            case 2:
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                System.out.println("| ID  | Name            | Phone Number  | Age | CourseID |");
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                dao.showAllStudent();
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                break;
	            case 3:
	                System.out.print("Enter id: ");
	                id=sc.nextInt();
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                System.out.println("| ID  | Name            | Phone Number  | Age | CourseID |");
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                dao.showStudentBasedOnID(id);
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                break;

	            case 4:
	                System.out.print("Enter id:");
	                id=sc.nextInt();
	                sc.nextLine();
	                System.out.print("Enter name:");
	                name=sc.nextLine();
	                dao.updateStudent(id, name);
	                System.out.println("Student updated successfully!");
	                break;

	            case 5:
	                System.out.print("Enter id: ");
	                id=sc.nextInt();
	                dao.deleteStudent(id);
	                System.out.println("Student deleted successfully!");
	                break;

	            case 6:
	                System.out.print("Loading");
	                for (int i = 0; i < 3; i++) {
	                    try {
	                        Thread.sleep(1000); // sleep for 1 second
	                        System.out.println(".");
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	                
	                return ;
	            default:
	                System.out.println("Invalid try again!!");
	                break;

	        }
	    } while(true);
	}


	
	public static void courseMethod() {
	    Scanner sc=new Scanner(System.in);
	    CourseImplement dao=new CourseImplement();
	    int courseId;
	    String name;
	    String Instructor;
	    do {
	    	System.out.println("+-----+-----------------+---------------+-----+----------+");
            System.out.println("| COURSE METHOD|");
            System.out.println("+-----+-----------------+---------------+-----+----------+");
	        System.out.print("1. Add Course\n" +
	                "2. Show All Course\n" +
	                "3. Show Course based on id \n" +
	                "4. Update the CourseName\n" +
	                "5. Delete the Course\n"+
	                "6. Go back to MainMenu"
	                );
	        System.out.println("+-----+-----------------+---------------+-----+----------+");
	        System.out.print("Enter Choice: ");
	    
	        int ch=sc.nextInt();

	        //This is to clear the screen

	        switch(ch) {
	            case 1:
	                Course stu=new Course();
	                System.out.println("Enter ID: ");
	                courseId=sc.nextInt();
	                sc.nextLine();
	                System.out.println("Enter name: ");
	                name=sc.nextLine();
	                System.out.println("Enter Instructor: ");
	                Instructor=sc.nextLine();

	                stu.setCourseId(courseId);
	                stu.setName(name);
	                stu.setInstructor(Instructor);
	                dao.createCourse(stu);
	                break;
	            case 2:
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                System.out.println("| CourseId  | Name            | Instructor|");
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                dao.showAllCourse();
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                break;
	            case 3:
	                System.out.print("Enter id: ");
	                courseId=sc.nextInt();
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                System.out.println("| CourseId  | Name            | Instructor|");
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                dao.showCourseBasedOnID(courseId);
	                System.out.println("+-----+-----------------+---------------+-----+----------+");
	                break;

	            case 4:
	                System.out.print("Enter id:");
	                courseId=sc.nextInt();
	                sc.nextLine();
	                System.out.print("Enter name:");
	                name=sc.nextLine();
	                dao.updateCourse(courseId, name);
	                break;
	            case 5:
	                System.out.print("Enter id: ");
	                courseId=sc.nextInt();
	                dao.deleteCourse(courseId);
	                break;
	            case 6:
	                System.out.print("Loading");
	                for (int i = 0; i < 3; i++) {
	                    try {
	                        Thread.sleep(1000); // sleep for 3 second
	                        System.out.println(".");
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	                
	                return;
	            default:
	                System.out.println("Invalid try again");
	                break;
	        }
	    } while (true);
	}
	public static void enrollMethod() {
		System.out.println("+-----+-----------------+---------------+-----+----------+");
        System.out.println("| ENROLLMENT DETAILS|");
        System.out.println("+-----+-----------------+---------------+-----+----------+");
		Enrollment en=new Enrollment();
		Enrollment.run();
		en.showAllStudent();
		System.out.println("Returning to Main Screen");
		for (int i = 0; i < 3; i++) {
	        try {
	            Thread.sleep(1000); // sleep for 3 second
	            System.out.println(".");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
		return;
		
			}
	
	public static void assessMethod() {
		Scanner sc=new Scanner(System.in);
		Assessment en=new Assessment();
		System.out.println("+-----+-----------------+---------------+-----+----------+");
        System.out.println("| REPORT|");
        System.out.println("+-----+-----------------+---------------+-----+----------+");
		en.showAllStudent();
		Assessment.run();
		en.showAllStudent();
		System.out.println("Do you want to delete a id?\n1.  Yes                   2.   No");
		int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("Enter the id: ");
			int id=sc.nextInt();
			en.deleteCourse(id);
			for (int i = 0; i < 3; i++) {
		        try {
		            Thread.sleep(1000); // sleep for 3 second
		            System.out.println(".");
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        
			}
			return;
		}
		else {
			System.out.println("Returning to Main Screen");
		for (int i = 0; i < 3; i++) {
	        try {
	            Thread.sleep(1000); // sleep for 3 second
	            System.out.println(".");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
			}
		
		return;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
        System.out.println("|STUDENT MANAGEMENT|");
		do{
		
			System.out.println("+-----+-----------------+---------------+-----+----------+");
        System.out.println("|MAIN MENU|");
        System.out.println("+-----+-----------------+---------------+-----+----------+");
			System.out.println("1. Student Registration\n" +
                "2. Course Allocation\n" +
                "3. Enrollment \n" +
                "4. Assessment\n"+
                "5.Exit"
               
				);
			 System.out.println("+-----+-----------------+---------------+-----+----------+");
		System.out.print("Enter your choice: ");
			int  choose= sc.nextInt();
			switch(choose) {
			case 1:
				studentMethod();
				break;
			case 2:
				courseMethod();
				break;
			case 3:
				enrollMethod();
				break;
			case 4:
				assessMethod();
				break;
			  case 5:
				  System.out.println("+-----+-----------------+---------------+-----+----------+");
			        System.out.println("| THANK YOU FOR USING OUR APPLICATION|\nE X I T I N G");
			        System.out.println("+-----+-----------------+---------------+-----+----------+");
				  for (int i = 0; i < 3; i++) {
				        try {
				            Thread.sleep(1000); // sleep for 3 second
				            System.out.print(".");
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
				    }
				  
				  System.exit(0);
			default:
				System.out.println("Please enter correct number(1-5)");
				break;
			}
		}while(true);}
		

}