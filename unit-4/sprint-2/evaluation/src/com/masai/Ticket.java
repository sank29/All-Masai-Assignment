package com.masai;

public class Ticket {
	int ticketid;
	int price;
	static int availableTickets;

	public int calculateTicketCost(int noOfTickets) {
		if (noOfTickets > availableTickets) {
			return -1;
		}
		int amount = price * noOfTickets;
		availableTickets = availableTickets - noOfTickets;
		return amount;
	}

//	public void printTicket() {
//		System.out.println("Enter no of bookings: ");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the available tickets: ");
//		availableTickets = sc.nextInt();
//		int numberOfBooking = sc.nextInt();
//
//		for (int i = 0; i <= numberOfBooking - 1; i++) {
//			System.out.println("Enter the ticketid:");
//			int ticketid = sc.nextInt();
//			System.out.println("Enter the price:");
//			price = sc.nextInt();
//			System.out.println("Enter the no of tickets:");
//			int noOfTickets = sc.nextInt();
//
//			System.out.println("Available tickets: " + availableTickets);
//			System.out.println("Total amount: " + calculateTicketCost(noOfTickets));
//			System.out.println("Available ticket after booking: " + availableTickets);
//
//		}
//	}

}
