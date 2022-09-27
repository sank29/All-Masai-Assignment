package com.ques3;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void doTransactions(List<? extends Payment> myList) {
		for (Payment eachTranstion : myList) {
			eachTranstion.doPayment();
		}
	}

	public static void main(String[] args) {
		CardPayment cardPayment1 = new CardPayment(8000);
		CardPayment cardPayment2 = new CardPayment(8000);

		CashPayment cashPayment1 = new CashPayment(6000);
		CardPayment cashPayment2 = new CardPayment(9000);

		List<Payment> myList = new ArrayList<>();

		myList.add(cardPayment1);
		myList.add(cardPayment2);

		myList.add(cashPayment1);
		myList.add(cashPayment2);

		doTransactions(myList);
	}

}
