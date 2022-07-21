package com.revature.zooParty;

public class Hippo implements Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("This creature noise is 'Rwar' when hunger is " + hunger);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Hippos eat " + food);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		String picture = "Tis a hippo";
		System.out.println(picture + " This creature sleeps a lot");
	}

	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.println("Hippos roam "+ location + " within a " + boundaries + " mile radi");
	}

	
}
