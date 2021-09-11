package com.xworkz.arrayelements;

public class NoDivisibleBy2and3 {

	public static void main(String[] args) {

		int numbers[] = { 10, 15, 20, 25, 30, 35, 41, 55, 46, 52, 64, 67, 72, 12, 34, 90 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0 && numbers[i] % 3 == 0) {
				System.out.println("numbers divisible by 2 and 3 are:" + numbers[i]);
				System.out.println();
			}

		}
	}

}
