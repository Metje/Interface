package com.wilders.ICanFly;

public class Nature {

	public static void main(String[] args) {

		Penguin pingou = new Penguin("Pingou");
		pingou.dive();
		pingou.swimDown(3);
		pingou.swimUp(1);
		pingou.swimDown(4);
		pingou.swimUp(5);
		pingou.swimUp(1);
		pingou.getOut();

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
