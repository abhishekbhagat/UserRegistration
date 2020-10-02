package com.bridgelabz.problem;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstName = sc.next();
		String pattern = "[A-Z]{1}[a-zA-Z]{2,}";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(firstName);
		if (m.matches())
			System.out.println("User First Name is valid ");
		else
			System.out.println("User First Name is invalid");
		sc.close();
	}

}
