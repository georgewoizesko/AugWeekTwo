package com.ZooProject;

public class Animals extends Zoo {
	
	protected String location = "Zoo";
	protected String animalClass = null;
	protected String order = null;
	protected String family = null;
	protected String species = null;
	protected String name = null;
	protected int age = 0;
	protected boolean alive = true;
	protected boolean hungry = false;
	protected boolean happy = false;
	
	
	public Animals(String location, String animalClass, String order, String family, String species, String name,
			int age, boolean alive, boolean hungry, boolean happy) {
		super();
		this.location = location;
		this.animalClass = animalClass;
		this.order = order;
		this.family = family;
		this.species = species;
		this.name = name;
		this.age = age;
		this.alive = alive;
		this.hungry = hungry;
		this.happy = happy;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getAnimalClass() {
		return animalClass;
	}


	public void setAnimalClass(String animalClass) {
		this.animalClass = animalClass;
	}


	public String getOrder() {
		return order;
	}


	public void setOrder(String order) {
		this.order = order;
	}


	public String getFamily() {
		return family;
	}


	public void setFamily(String family) {
		this.family = family;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isAlive() {
		return alive;
	}


	public void setAlive(boolean alive) {
		this.alive = alive;
	}


	public boolean isHungry() {
		return hungry;
	}


	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}


	public boolean isHappy() {
		return happy;
	}


	public void setHappy(boolean happy) {
		this.happy = happy;
	}
	
	
	
}
