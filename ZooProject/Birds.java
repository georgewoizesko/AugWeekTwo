package com.ZooProject;

public class Birds extends Animals{
	
	protected String habitat = null;
	protected int numOfEggs = 0;
	protected boolean flight = true;
	protected boolean flock = false;
	protected boolean swim = false;
	public Birds(String location, String animalClass, String order, String family, String species, String name, int age,
			boolean alive, boolean hungry, boolean happy, String habitat, int numOfEggs, boolean flight, boolean flock,
			boolean swim) {
		super(location, animalClass, order, family, species, name, age, alive, hungry, happy);
		this.habitat = habitat;
		this.numOfEggs = numOfEggs;
		this.flight = flight;
		this.flock = flock;
		this.swim = swim;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public int getNumOfEggs() {
		return numOfEggs;
	}
	public void setNumOfEggs(int numOfEggs) {
		this.numOfEggs = numOfEggs;
	}
	public boolean isFlight() {
		return flight;
	}
	public void setFlight(boolean flight) {
		this.flight = flight;
	}
	public boolean isFlock() {
		return flock;
	}
	public void setFlock(boolean flock) {
		this.flock = flock;
	}
	public boolean isSwim() {
		return swim;
	}
	public void setSwim(boolean swim) {
		this.swim = swim;
	}
	
	
}
