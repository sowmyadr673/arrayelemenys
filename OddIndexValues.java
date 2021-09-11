package com.xworkz.arrayelements;

public class OddIndexValues {

	public static void main(String[] args) {

		int numbers[] = { 10, 15, 20, 25, 30, 35, 41, 55, 46, 52, 64, 67, 72, 12, 34, 90 };
		System.out.println("odd index values are:");
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 != 0) {
				System.out.println("Index Value:" + i);
				System.out.println("number is:" + numbers[i]);
				System.out.println();
			}
		}

	}
}