package com.sabochick.backgammon.board;

import java.util.Random;

public class Die {
	private Random rand;

	public Die() {
		rand = new Random();
	}

	protected int rollDie() {
		return rand.nextInt(6) + 1; // return 1 through 6 (inclusive)
	}

}
