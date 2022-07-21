package com.revature.zooParty;

public class Lion extends Feline{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("This creature noise is 'Meorwar' when hunger is " + hunger);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lions eat " + food);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		String picture = "Tis a Lion";
		System.out.println(picture + " This creature sleeps a lot");
	}

	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.println("Lion roams "+ location + " within a " + boundaries + " mile radi");
	}

}
