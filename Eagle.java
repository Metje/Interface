package com.wilders.ICanFly;

public class Eagle extends Bird implements Fly {
	private int altitude;
	private boolean flying;
	

	// constructor
	public Eagle(String name) {
		super(name);
		this.flying = false;
		this.altitude = 0;
	}

	// Getters + Setters
	public int getAltitude() {
		return altitude;
	}

	public boolean isFlying() {
		return flying;
	}

	// Methoden

	@Override
	public String sing() {
		return "Screech!";
	}

	@Override
	public void takeOff() {
		System.out.println(this.getName() + " takes off in the sky.");
	};

	@Override
	public int ascend(int meters) {
		this.altitude += meters;
		System.out.println(this.getName() + " flies upward, altitude: " + this.altitude);
		return this.altitude; // aktuelle Flughöhe
	}

	@Override
	public int decent(int meters) {
		if (meters < this.altitude)
			this.altitude -= meters;
		else
			this.altitude = 0;

		System.out.println(this.getName() + " flies downward, altitude: " + this.altitude);
		return this.altitude; // aktuelle Flughöhe
	};

	@Override
	public void land() {
		if (this.altitude >= 10)
			System.out.println(this.getName() + " is too high, it can't land.");
		else
			System.out.println(this.getName() + " lands on the ground.");
	};

}
