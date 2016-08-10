package com.ZooProject;

public class Insects extends Animals{
	
	protected String region = null;
	protected int numOfLegs = 0;
	protected int numOfEggs = 0;
	protected boolean parasite = false;
	protected boolean swarm = false;
	public Insects(String location, String animalClass, String order, String family, String species, String name,
			int age, boolean alive, boolean hungry, boolean happy, String region, int numOfLegs, int numOfEggs,
			boolean parasite, boolean swarm) {
		super(location, animalClass, order, family, species, name, age, alive, hungry, happy);
		this.region = region;
		this.numOfLegs = numOfLegs;
		this.numOfEggs = numOfEggs;
		this.parasite = parasite;
		this.swarm = swarm;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	public int getNumOfEggs() {
		return numOfEggs;
	}
	public void setNumOfEggs(int numOfEggs) {
		this.numOfEggs = numOfEggs;
	}
	public boolean isParasite() {
		return parasite;
	}
	public void setParasite(boolean parasite) {
		this.parasite = parasite;
	}
	public boolean isSwarm() {
		return swarm;
	}
	public void setSwarm(boolean swarm) {
		this.swarm = swarm;
	}
	@Override
	public String toString() {
		return "Insects [region=" + region + ", numOfLegs=" + numOfLegs + ", numOfEggs=" + numOfEggs + ", parasite="
				+ parasite + ", swarm=" + swarm + ", location=" + location + ", animalClass=" + animalClass + ", order="
				+ order + ", family=" + family + ", species=" + species + ", name=" + name + ", age=" + age + ", alive="
				+ alive + ", hungry=" + hungry + ", happy=" + happy + "]";
	}
	
	

}
