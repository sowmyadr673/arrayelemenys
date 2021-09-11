package com.xworkz.arrayelements;

public class ListOfCompanies {

	public static void main(String[] args) {

		String ListOfCompanies[] = { "google", "IBM", "Infosys", "cisco", "microsift" };
		System.out.println("size of the array" + ListOfCompanies.length);
		System.out.println("comany names are:");
		for (int i = 0; i < ListOfCompanies.length; i++) {
			System.out.println(ListOfCompanies[i]);
		}

	}
}
