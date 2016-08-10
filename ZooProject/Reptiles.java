package com.ZooProject;

public class Reptiles extends Animals{
	
	protected int numOfLegs = 0;
	protected int numOfOffspring = 0;
	protected boolean scales = true;
	protected boolean shell = false;
	protected boolean eggs = false;
	public Reptiles(String location, String animalClass, String order, String family, String species, String name,
			int age, boolean alive, boolean hungry, boolean happy, int numOfLegs, int numOfOffspring, boolean scales,
			boolean shell, boolean eggs) {
		super(location, animalClass, order, family, species, name, age, alive, hungry, happy);
		this.numOfLegs = numOfLegs;
		this.numOfOffspring = numOfOffspring;
		this.scales = scales;
		this.shell = shell;
		this.eggs = eggs;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	public int getNumOfOffspring() {
		return numOfOffspring;
	}
	public void setNumOfOffspring(int numOfOffspring) {
		this.numOfOffspring = numOfOffspring;
	}
	public boolean isScales() {
		return scales;
	}
	public void setScales(boolean scales) {
		this.scales = scales;
	}
	public boolean isShell() {
		return shell;
	}
	public void setShell(boolean shell) {
		this.shell = shell;
	}
	public boolean isEggs() {
		return eggs;
	}
	public void setEggs(boolean eggs) {
		this.eggs = eggs;
	}
	@Override
	public String toString() {
		return "Reptiles [numOfLegs=" + numOfLegs + ", numOfOffspring=" + numOfOffspring + ", scales=" + scales
				+ ", shell=" + shell + ", eggs=" + eggs + ", location=" + location + ", animalClass=" + animalClass
				+ ", order=" + order + ", family=" + family + ", species=" + species + ", name=" + name + ", age=" + age
				+ ", alive=" + alive + ", hungry=" + hungry + ", happy=" + happy + "]";
	}
	
	
}
