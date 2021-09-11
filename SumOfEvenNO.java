package com.xworkz.arrayelements;

public class SumOfEvenNO {

	public static void main(String[] args) {

		int numbers[] = { 10, 15, 20, 25, 30, 35, 41, 55, 46, 52, 64, 67, 72, 12, 34, 90 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum = sum + numbers[i];
			}
		}
		System.out.println("sum of even numbers=" + sum);
	}
}
