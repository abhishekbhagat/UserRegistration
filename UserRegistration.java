package com.bridgelabz.problem;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstName = sc.next();
		String pattern = "[A-Z]{1}[a-zA-Z]{2,}";

		Pattern pFirstName = Pattern.compile(pattern);
		Matcher mFirstName = p.matcher(firstName);
		if (mFirstName.matches())
			System.out.println("User First Name is valid ");
		else
			System.out.println("User First Name is invalid");

		// uc2 check for last name
		System.out.println("Enter the Last Name");
		String lastName = sc.next();
		String patternLastName = "[A-Z]{1}[a-zA-Z]{2,}";

		Pattern pLastName = Pattern.compile(pattern);
		Matcher mLastName = pLastName.matcher(lastName);
		if (mLastName.matches())
			System.out.println("User Last Name is valid ");
		else
			System.out.println("User Last Name is invalid");
		sc.close();
	}

}
