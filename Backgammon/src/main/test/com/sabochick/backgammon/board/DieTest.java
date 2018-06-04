package com.sabochick.backgammon.board;

import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest {

	@Test
	public void testRollDie() {
		int min = 0;
		int max = 6;
		Die die = new Die();
		int result = die.rollDie();
		assertTrue("Rolled number (result) is out of range: " + result, min <= result && result <= max);
	}

}
