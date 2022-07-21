package com.revature.zooParty;

public class Tiger extends Feline{

	@Override
	public void makeNoise() {
		
		// TODO Auto-generated method stub
		System.out.println("This creature noise is 'Meow' when hunger is " + hunger);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Tigers eat " + food);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		String picture = "Tis a Tiger";
		System.out.println(picture + " This creature sleeps a lot");
	}


	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.println("Tigers roams "+ location + " within a " + boundaries + " mile radi");
	}

}
