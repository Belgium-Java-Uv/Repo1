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
}
