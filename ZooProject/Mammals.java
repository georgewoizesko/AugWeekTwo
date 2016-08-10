package com.ZooProject;

public class Mammals extends Animals{
	
	protected boolean claws = false;
	protected boolean hooves = false;
	protected float hairLength = 0.0f;
	protected String habitat = null;
	public Mammals(String location, String animalClass, String order, String family, String species, String name,
			int age, boolean alive, boolean hungry, boolean happy, boolean claws, boolean hooves, float hairLength,
			String habitat) {
		super(location, animalClass, order, family, species, name, age, alive, hungry, happy);
		this.claws = claws;
		this.hooves = hooves;
		this.hairLength = hairLength;
		this.habitat = habitat;
	}
	@Override
	public String toString() {
		return "Mammals [claws=" + claws + ", hooves=" + hooves + ", hairLength=" + hairLength + ", habitat=" + habitat
				+ ", location=" + location + ", animalClass=" + animalClass + ", order=" + order + ", family=" + family
				+ ", species=" + species + ", name=" + name + ", age=" + age + ", alive=" + alive + ", hungry=" + hungry
				+ ", happy=" + happy + "]";
	}
	public boolean isClaws() {
		return claws;
	}
	public void setClaws(boolean claws) {
		this.claws = claws;
	}
	public boolean isHooves() {
		return hooves;
	}
	public void setHooves(boolean hooves) {
		this.hooves = hooves;
	}
	public float getHairLength() {
		return hairLength;
	}
	public void setHairLength(float hairLength) {
		this.hairLength = hairLength;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
	
	
	
}
