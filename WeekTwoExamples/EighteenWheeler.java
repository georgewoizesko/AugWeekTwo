package com.WeekTwoExamples;

public class EighteenWheeler extends Vehicle {

	private int wheels = 18;
    private boolean trailer = true;
    private String horn = "honk honk";
    
    
    




	public EighteenWheeler(boolean running, String color, String condition, boolean fueledUp, int numSeats, int wheels,
			int wheels2, boolean trailer, String horn) {
		super(running, color, condition, fueledUp, numSeats, wheels);
		wheels = wheels2;
		this.trailer = trailer;
		this.horn = horn;
	}

	
	public void withoutATrailer() {
		   if (!(trailer)) {
			   wheels = 10;
		   }
	}

}
