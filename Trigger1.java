package com.thread;

public class Trigger1 {

	public static void main(String[] args) {
		
		//Amazon
		Job1 jb1 = new Job1();
		jb1.setName("Amazon");
		jb1.start();
		
		//Flipkard
		Job1 jb2 =new Job1();
		jb1.setName("Flipkard");
		jb2.start();
	}
}
