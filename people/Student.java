package com.people;

public class Student extends Person{
	
	private String studentID = null;
	private boolean coffed = false;
	private boolean inclassroom = false;
	private boolean payingAttention = false;

	
	public Student(String name, int age, String gender, float height, String studentID, boolean coffed,
			boolean inclassroom, boolean payingAttention) {
		super(name, age, gender, height);
		this.studentID = studentID;
		this.coffed = coffed;
		this.inclassroom = inclassroom;
		this.payingAttention = payingAttention;
	}


	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}


	public boolean isCoffed() {
		return coffed;
	}


	public void setCoffed(boolean coffed) {
		this.coffed = coffed;
	}


	public boolean isInclassroom() {
		return inclassroom;
	}


	public void setInclassroom(boolean inclassroom) {
		this.inclassroom = inclassroom;
	}


	public boolean isPayingAttention() {
		return payingAttention;
	}


	public void setPayingAttention(boolean payingAttention) {
		this.payingAttention = payingAttention;
	}


	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", coffed=" + coffed + ", inclassroom=" + inclassroom
				+ ", payingAttention=" + payingAttention + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", height=" + height + "]";
	}


	
	
	
	

}
