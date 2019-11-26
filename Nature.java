package com.wilders.ICanFly;

public class Nature {

	public static void main(String[] args) {
		Eagle myEagle = new Eagle("Hawkey");

		myEagle.takeOff();
		myEagle.ascend(120);
		myEagle.ascend(30);
		myEagle.glide();
		myEagle.decent(140);
		myEagle.land();
		myEagle.decent(9);
		myEagle.land();
		
		
	}

}
