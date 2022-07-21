package com.revature.zooParty;

public class Cat extends Feline {

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("This creature noise is 'Meow' when hunger is " + hunger);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cats eat " + food);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		String picture = "Tis a cat";
		System.out.println(picture + " This creature sleeps a lot");
	}

	@Override
	public void roam() {
		int boundaries = 50;
		// TODO Auto-generated method stub
		System.out.println("Cats roams "+ location + " within a " + boundaries + " mile radi");
	}

}
