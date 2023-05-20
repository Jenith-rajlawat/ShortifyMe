package com.StudentApplication;

import java.util.List;

public class Student {
      	private int id;
		private String name;
      	private long phonenumber;
      	private int age;
      	private int courseId;
      	private List<Integer> courseIds;

      	
      	@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", age=" + age
					+ ", courseId=" + courseId + "]";
		}
      	public void setCourseIds(List<Integer> courseIds) {
      	    this.courseIds = courseIds;
      	}


      	public int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}
		public Student() {
      		
      	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPhoneNumber() {
			return phonenumber;
		}
		public void setPhoneNumber(long phonenumber) {
			this.phonenumber = phonenumber;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}
