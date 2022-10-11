package com.greatlearning.bankingtarget.service;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");

		int noOfTransactions = sc.nextInt();
		long[] transactionArray = new long[noOfTransactions];

		System.out.println("Enter the values of array");

		for (int i = 0; i < noOfTransactions; i++) {
			transactionArray[i] = sc.nextLong();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");

		int noOfTargets = sc.nextInt();

		while (noOfTargets > 0) {

			int counter = 0;
			int sum = 0;
			boolean targetAchieved = false;

			System.out.println("enter the value of target");
			long targetValue = sc.nextLong();

			for (int i = 0; i < noOfTransactions; i++) {
				sum += transactionArray[i];
				counter++;
				if (sum > targetValue) {
					targetAchieved = true;
					break;
				}
			}

			if (targetAchieved) {
				System.out.println("Target achieved after " + counter + " transactions. \n");
			} else {
				System.out.println("Given target not achieved. \n");
			}

			noOfTargets--;
		}
		sc.close();
	}
}
