package com.masai;

import java.util.Scanner;

public class TicketsMain {

	public static void main(String[] args) {
		Ticket newTicket = new Ticket();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of bookings: ");
		int numberOfBooking = sc.nextInt();
		System.out.println("Enter the available tickets: ");
		newTicket.availableTickets = sc.nextInt();

		for (int i = 0; i <= numberOfBooking - 1; i++) {
			System.out.println("Enter the ticketid:");
			int ticketid = sc.nextInt();
			System.out.println("Enter the price:");
			newTicket.price = sc.nextInt();
			System.out.println("Enter the no of tickets:");
			int noOfTickets = sc.nextInt();

			System.out.println("Available tickets: " + newTicket.availableTickets);
			System.out.println("Total amount: " + newTicket.calculateTicketCost(noOfTickets));
			System.out.println("Available ticket after booking: " + newTicket.availableTickets);
		}
	}
}
