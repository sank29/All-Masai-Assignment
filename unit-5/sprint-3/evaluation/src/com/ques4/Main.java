package com.ques4;

public class Main {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new KohliThread());
		thread1.setName("Kohli");
		thread1.setPriority(1);

		Thread thread2 = new Thread(new DhoniThread());
		thread2.setName("Dhoni");
		thread2.setPriority(10);

		Thread thread3 = new Thread(new RohitThread());
		thread3.setName("Rohit");
		thread1.setPriority(5);

		thread2.start();
		thread3.start();
		thread1.start();

	}

}
