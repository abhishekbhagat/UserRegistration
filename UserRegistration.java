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
		Matcher mFirstName = pFirstName.matcher(firstName);
		if (mFirstName.matches())
			System.out.println("User First Name is valid ");
		else
			System.out.println("User First Name is invalid");

		// uc2 check for last name
		System.out.println("Enter the Last Name");
		String lastName = sc.next();
		String patternLastName = "[A-Z]{1}[a-zA-Z]{2,}";

		Pattern pLastName = Pattern.compile(patternLastName);
		Matcher mLastName = pLastName.matcher(lastName);
		if (mLastName.matches())
			System.out.println("User Last Name is valid ");
		else
			System.out.println("User Last Name is invalid");

		// UC3
		System.out.println("Enter the email id");
		String emailId = sc.next();
		String patternEmailId = "[A-Z]{1}[a-zA-Z]{2,}";

		Pattern pEmailId = Pattern.compile(patternEmailId);
		Matcher mEmailId = pEmailId.matcher(emailId);
		if (mEmailId.matches())
			System.out.println("User EmailId is valid ");
		else
			System.out.println("User  Email Id is invalid");

		// uc4
		System.out.println("Enter the Mobile Number");
		String mobileNumber = sc.next();
		String patternMobileNumber = "[1-9]{1}[0-9]{1}( )[1-9]{1}[0-9]{9}";

		Pattern pMobileNumber = Pattern.compile(patternMobileNumber);
		Matcher mMobileNumber = pMobileNumber.matcher(mobileNumber);
		if (mMobileNumber.matches())
			System.out.println("User mobile number is valid ");
		else
			System.out.println("User  mobile number is  invalid");
		sc.close();
	}

}
