package com.xworkz.arrayelements;

public class OddNumbers {

	public static void main(String[] args) {

		int numbers[] = { 10, 15, 20, 25, 30, 35, 41, 55, 46, 52, 64, 67, 72, 12, 34, 90 };
		System.out.println("odd Nos are : ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.println(numbers[i]);
			}
		}

	}
}