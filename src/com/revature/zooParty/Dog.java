package com.revature.zooParty;

public class Dog extends Canine{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("This creature noise is 'bark' when hunger is " + hunger);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dogs eat " + food);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		String picture = "Tis a dog";
		System.out.println(picture + " This creature sleeps a little");
	}

	@Override
	public void roam() {
		int boundaries = 1;
		// TODO Auto-generated method stub
		System.out.println("Canine roams "+ location + " within a " + boundaries + " mile radi");
	}

	
}
