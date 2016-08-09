package com.BattingAverage;

import java.util.Scanner;

public class BatAvg {

	public static void main(String[] args) {
		
		
		System.out.println("How many at bats?");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		int[] basesArray = new int[userInput];
		int hit=0;
		
		for (int i = 0; i < userInput; i++) {
			System.out.println("how many bases for at bat " +( i+1));
			Scanner sc2 = new Scanner(System.in);
			int bases = sc2.nextInt();
			//bases = i;
		
			basesArray[i]= bases;
			 if (bases > 0) {
				hit	= hit+ 1;		
				
			}
			//System.out.println(basesArray [i]);
		
		}
		System.out.println("Number of hits " + hit);
		

	}

}
