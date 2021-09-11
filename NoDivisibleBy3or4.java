package com.xworkz.arrayelements;

public class NoDivisibleBy3or4 {
	public static void main(String[] args) {

		int numbers[] = { 10, 15, 20, 25, 30, 35, 41, 55, 46, 52, 64, 67, 72, 12, 34, 90 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0 || numbers[i] % 4 == 0) {
				System.out.println("numbers divisible by 3 or 4 are:" + numbers[i]);
				System.out.println();
			}

		}
	}

}
