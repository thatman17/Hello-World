package com.revature;
//Reverse domain name

/**
 * HelloWorld
 * Javadoc commentt
 * @author Elia Rice
 * 
 *  */public class HelloWorld {
	/**
	 * 
	 * @param args args take up a name in index 0
	 */
	public static void main (String[] args) {
		// String name = "Mehrab"; Inline Comment
		if (args.length > 0)
		System.out.println("Hello, " + args[0] + "!");
		else {
			System.out.println("Usage: java HelloWorld name");
		}
		/*
	 *Block Comment
	 */
	}
}