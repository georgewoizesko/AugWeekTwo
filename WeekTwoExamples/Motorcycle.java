package com.WeekTwoExamples;

public class Motorcycle extends Vehicle{
	
	private boolean sidecar = false;

	public Motorcycle(boolean running, String color, String condition, boolean fueledUp, int numSeats, int wheels,
			boolean sidecar) {
		super(running, color, condition, fueledUp, numSeats, wheels);
		this.sidecar = sidecar;
	}
	

	public boolean isSidecar() {
		return sidecar;
	}


	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}


	public void doWeHaveASidecar() {
		if (sidecar) {
			wheels += 1;
			numSeats += 1;
		}
		
	
	}

		
		
		
}
