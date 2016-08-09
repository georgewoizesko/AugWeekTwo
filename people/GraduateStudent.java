package com.people;

public class GraduateStudent extends Student{

private boolean hasGraduated = false;
private boolean hasJob = false;

public GraduateStudent(String name, int age, String gender, float height, String studentID, boolean coffed,
		boolean inclassroom, boolean payingAttention, boolean hasGraduated, boolean hasJob) {
	super(name, age, gender, height, studentID, coffed, inclassroom, payingAttention);
	this.hasGraduated = hasGraduated;
	this.hasJob = hasJob;
}


}
