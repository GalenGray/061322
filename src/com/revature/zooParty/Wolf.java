package com.revature.zooParty;

public class Wolf extends Canine {

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("This creature noise is 'grrr' when hunger is " + hunger);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Wolves eat " + food);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		String picture = "Tis a wolf";
		System.out.println(picture + " This creature sleeps a little");
	}


	@Override
	public void roam() {
		int boundaries = 100;
		// TODO Auto-generated method stub
		System.out.println("Wolves roams "+ location + " within a " + boundaries + " mile radi");
	}

}
