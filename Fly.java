package com.wilders.ICanFly;

public interface Fly {
	
	void takeOff();
	
	int ascend (int meters);
	
	int decent (int meters);
	
	void land();
	
	default void glide() {
		System.out.println("glides into the air");
	}

}
