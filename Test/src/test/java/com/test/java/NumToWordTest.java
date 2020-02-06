package com.test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.java.NumToWord;

public class NumToWordTest {	

	@Test
	public final void whenZeroIsSupplied() {
		assertEquals("zero", new NumToWord().checkInputAndConvert("0"));
		assertEquals("zero", new NumToWord().checkInputAndConvert("00000"));
	}
	
}
