package com.main.java;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class NumToWord {

	private static final String[] specialNames = { "", " thousand"

			// Below values can be enabled as per the requirement of the range
			// if it has to exceed 999999
			// Also the Pattern needs to be modified if the range has to exceed
			// the limit 999999

			/*
			 * , " million"," billion", " trillion", " quadrillion",
			 * " quintillion"
			 */

	};

	public static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	public static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	private String convertLessThanOneThousand(int intNumber) {
		String current;

		if (intNumber % 100 < 20) {
			current = numNames[intNumber % 100];
			intNumber /= 100;
		} else {
			current = numNames[intNumber % 10];
			intNumber /= 10;

			current = tensNames[intNumber % 10] + current;
			intNumber /= 10;
		}
		if (intNumber == 0)
			return current;
		return numNames[intNumber] + " hundred" + current;
	}

	public String convert(String strNumber) {

		int intNumber = Integer.parseInt(strNumber.toString()); // ConvertsToIntValueAndAlsoRemovesLeadingZerosIfAny;

		if (intNumber == 0) {
			return "zero";
		}

		String prefix = "";

		if (intNumber < 0) {
			intNumber = -intNumber;
			prefix = "negative";
		}

		String current = "";
		int place = 0;

		do {
			int n = intNumber % 1000;
			if (n != 0) {
				String s = convertLessThanOneThousand(n);
				current = s + specialNames[place] + current;
			}
			place++;
			intNumber /= 1000;
		} while (intNumber > 0);

		return (prefix + current).trim();

	}

	public String checkInputAndConvert(String strNumber) {

		if (strNumber != null && !strNumber.equals("")) {
			String pattern = "[-+]?[0]*|[-+]?[0]*[1-9][0-9]{0,5}";

			boolean isValidInput = Pattern.matches(pattern, strNumber);
			if (isValidInput) {
				return convert(strNumber);
			} else {
				return "Invalid input";
			}

		} else {
			return "Invalid input";
		}
	}
}
