package com.ZooProject;

public class Fish extends Animals{
	
	protected int numOfFins = 0;
	protected boolean scales = true;
	protected boolean gameFish = false;
	protected boolean saltWater = false;
	
	public Fish(String location, String animalClass, String order, String family, String species, String name, int age,
			boolean alive, boolean hungry, boolean happy, int numOfFins, boolean scales, boolean gameFish,
			boolean saltWater) {
		super(location, animalClass, order, family, species, name, age, alive, hungry, happy);
		this.numOfFins = numOfFins;
		this.scales = scales;
		this.gameFish = gameFish;
		this.saltWater = saltWater;
	}

	public int getNumOfFins() {
		return numOfFins;
	}

	public void setNumOfFins(int numOfFins) {
		this.numOfFins = numOfFins;
	}

	public boolean isScales() {
		return scales;
	}

	public void setScales(boolean scales) {
		this.scales = scales;
	}

	public boolean isGameFish() {
		return gameFish;
	}

	public void setGameFish(boolean gameFish) {
		this.gameFish = gameFish;
	}

	public boolean isSaltWater() {
		return saltWater;
	}

	public void setSaltWater(boolean saltWater) {
		this.saltWater = saltWater;
	}

	@Override
	public String toString() {
		return "Fish [numOfFins=" + numOfFins + ", scales=" + scales + ", gameFish=" + gameFish + ", saltWater="
				+ saltWater + ", location=" + location + ", animalClass=" + animalClass + ", order=" + order
				+ ", family=" + family + ", species=" + species + ", name=" + name + ", age=" + age + ", alive=" + alive
				+ ", hungry=" + hungry + ", happy=" + happy + "]";
	}

	
	
}
