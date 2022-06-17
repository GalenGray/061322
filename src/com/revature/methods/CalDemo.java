package com.revature.methods;

public class CalDemo {
 public static void main(String[] args) {
	// no limit on how many varibles used
	 int result = sum(10,12,13);
	 System.out.println("Result = " +result);
}
 // method with var arg OR variable argument int ...num
 // var arg(...) are passed as array
 // should be the last parameter or the only one 
 public static int sum(int ...num) {
	int res = 0;
	for(int i=0; i<num.length; i++)
  res = res+num[i];
	return res; 
 }

}
