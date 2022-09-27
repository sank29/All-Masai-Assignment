package com.masai;

public class Main {
       public static void runScored(int one, int two, int three, int four ,int six) {
            // write your logic here
    	  int totalScore = one + two+ three+ four + six;
    	  System.out.println(totalScore);
}
    public static void main(String[] args){
     //call runScored with valid parameters
    	
    	runScored(10, 20, 30, 40, 50);
}
}