package com.main.java;

import java.util.regex.Pattern;

public class NumToWord {

	public String convert(String strNumber) {

		int intNumber = Integer.parseInt(strNumber.toString()); // ConvertsToIntValueAndAlsoRemovesLeadingZerosIfAny;

		if (intNumber == 0) {
			return "zero";
		}
		return "";

	}

	public String checkInputAndConvert(String strNumber) {

		if (strNumber != null && !strNumber.equals("")) {
			String pattern = "[-+]?[0]*";

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
