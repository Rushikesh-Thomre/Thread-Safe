package com.thread;

public class Job1 extends Thread {

	private static int Balance = 1000;

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			Withdraw(150);
		}
		
	}

	private static synchronized void Withdraw(int amt) {
		
		if (Balance > 100) {
			System.out.println(Thread.currentThread().getName());
			Balance = Balance - amt;
			System.out.println("History of the balance");
			System.out.println("--------------------------");
			System.out.println("Remaining Balance" + "  "+Balance);
		} else {
			System.out.println("Insufficient Fund..");
		}
	}

}
