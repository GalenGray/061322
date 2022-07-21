package com.revature.zooParty;

public abstract class Feline implements Animal {

	public void roam() {
		// TODO Auto-generated method stub
		 String location = "Outside";
		 int boundaries = 1000;
		System.out.println("Feline roams "+ location + " within a " + boundaries + " mile radi");
	}
}
