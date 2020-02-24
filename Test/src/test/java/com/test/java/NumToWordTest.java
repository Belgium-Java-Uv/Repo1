package com.test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.main.java.NumToWord;

public class NumToWordTest {	

	NumToWord numToWord;

	@Before
	public void setUp() {
		numToWord = new NumToWord();
	}

	@Test
	public final void whenZeroIsSupplied() {
		assertEquals("zero", numToWord.checkInputAndConvert("0"));
		assertEquals("zero", numToWord.checkInputAndConvert("00000"));
	}

	@Test
	public final void whenZeroIsSuppliedWithLeadingPlusOrMinus() {
		assertEquals("zero", numToWord.checkInputAndConvert("+0"));
		assertEquals("zero", numToWord.checkInputAndConvert("-0"));
		assertEquals("zero", numToWord.checkInputAndConvert("-000"));
		assertEquals("zero", numToWord.checkInputAndConvert("+000"));
	}
	
	@Test
	public final void whenSixDigitsIsSuppliedWithOrWithoutLeadingZeros() {
		assertEquals("one hundred twenty three thousand four hundred fifty six",
				numToWord.checkInputAndConvert("123456"));
		assertEquals("one hundred twenty three thousand four hundred fifty six",
				numToWord.checkInputAndConvert("00123456"));
	}

	@Test
	public final void whenValueIsSuppliedWithLeadingMinus() {
		assertEquals("negative nine hundred ninety nine thousand nine hundred ninety nine", numToWord.checkInputAndConvert("-999999"));
	}
	
	@Test
	public final void whenValueIsSuppliedWithTrailingPlus() {
		assertEquals("Invalid input", numToWord.checkInputAndConvert("999999+"));
	}

	@Test
	public final void whenOtherThanNumberIsSupplied() {
		assertEquals("Invalid input", numToWord.checkInputAndConvert("9abc99$#"));
	}

	@Test
	public final void whenMaxLimitValueIsSupplied() {
		assertEquals("nine hundred ninety nine thousand nine hundred ninety nine", numToWord.checkInputAndConvert("999999"));
	}
	
	@Test
	public final void whenValueMoreThanMaxLimitIsSupplied() {
		assertEquals("Invalid input", numToWord.checkInputAndConvert("1000000"));
	}
	
	@Test
	public final void whenValueIsSuppliedWithLeadingOrTrailingSpace() {
		assertEquals("two", numToWord.checkInputAndConvert(" 2 "));
	}
	
	@Test
	public final void whenEmptyValueOrNullIsSupplied() {
		assertEquals("Invalid input", numToWord.checkInputAndConvert(""));
		assertEquals("Invalid input", numToWord.checkInputAndConvert(null));
	}
}
