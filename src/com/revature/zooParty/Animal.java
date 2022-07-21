package com.revature.zooParty;
/*
Create the Animal 
interface, Feline and Canine
abstract classes, and the 
concrete animal classes.
Each should have a variable
and a method. 
Create an object of each, 
call all of the methods
 for each object, and 
observe the effects.
*/
public interface Animal {
public static String location  = "";
public final String food = "Meat";
int boundaries=0;
int hunger=0;
String picture=""; 

public void makeNoise();
public void eat();
public void sleep();
public void roam(); 
}
