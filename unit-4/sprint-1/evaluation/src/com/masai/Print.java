package com.masai;

public class Print {
	static void printMonths(String month) {
		
		switch (month) {
		case "JAN": {	
			System.out.println("This is the 1st Month of the Year January");
			break;
		}
		case "FEB":{
			System.out.println("This is the 1st Month of the Year February");
			break;
		}
		case "MAR":{
			System.out.println("This is the 1st Month of the Year March");
			break;
		}
		case "APR":{
			System.out.println("This is the 1st Month of the Year April");
			break;
		}
		case "MAY":{
			System.out.println("This is the 1st Month of the Year May");
			break;
		}
		case "June":{
			System.out.println("This is the 1st Month of the Year June");
			break;
		}
		case "JULY":{
			System.out.println("This is the 1st Month of the Year July");
			break;
		}
		case "AUG":{
			System.out.println("This is the 1st Month of the Year August");
			break;
		}
		case "SEPT":{
			System.out.println("This is the 1st Month of the Year September");
			break;
		}
		case "OCT":{
			System.out.println("This is the 1st Month of the Year October");
			break;
		}
		case "NOV":{
			System.out.println("This is the 1st Month of the Year November");
			break;
		}
		case "DEC":{
			System.out.println("This is the 1st Month of the Year December");
			break;
		}
		default:
			System.out.println("Please enter valid month code");
		}
		
	}

	public static void main(String[] args) {
		printMonths("JAN");
		printMonths("DEC");
	}

}
