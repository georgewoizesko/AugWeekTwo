package com.WeekTwoExamples;

public class Vehicle {

	   // State
    protected boolean running = false;
    protected String color = null;
    protected String condition = null;
    protected boolean fueledUp = false;
    protected int numSeats = 0;
    protected int wheels = 0;
    
    
    // Constructor
    public Vehicle(boolean running, String color, String condition, boolean fueledUp, int numSeats, int wheels) {
        super();
        this.running = running;
        this.color = color;
        this.condition = condition;
        this.fueledUp = fueledUp;
        this.numSeats = numSeats;
        this.wheels = wheels;
        
        
    }
    

    public boolean isRunning() {
		return running;
	}


	public void setRunning(boolean running) {
		this.running = running;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	public boolean isFueledUp() {
		return fueledUp;
	}


	public void setFueledUp(boolean fueledUp) {
		this.fueledUp = fueledUp;
	}


	public int getNumSeats() {
		return numSeats;
	}


	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}


	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	// Behavior
    protected void turnOn() {
        running = true;
        
    }

}
