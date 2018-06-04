package com.sabochick.backgammon.board;

import java.util.ArrayList;

public class Pip {
	private int id;
	private ArrayList<Checker> checkers = new ArrayList<Checker>();

	public int getNumberOfCheckers() {
		return checkers.size();
	}

	public void addCheckerToPip(Checker checker) {
		if (this.getNumberOfCheckers() >= 2
				&& !checker.getOwner().equals(checkers.get(0).getOwner())) {
			System.out
					.println("Unable to move checker. Pip is owned by other player");
			return;
		}
		if (checkers.contains(checker)) {
			System.out.println("Checker already present on pip");
			return;
		} else
			checkers.add(checker);
	}

	public void removeCheckerFromPip(Checker checker) {
		if (checkers.contains(checker)) {
			checkers.remove(checker);
		} else
			System.out
					.println("Unable to remove checker; checker not foud on pip");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
