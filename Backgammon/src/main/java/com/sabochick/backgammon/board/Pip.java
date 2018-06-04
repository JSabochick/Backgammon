package com.sabochick.backgammon.board;

import java.util.ArrayList;

public class Pip {
	protected int position;
	protected ArrayList<Checker> checkers = new ArrayList<Checker>();
	
	public Pip(int i){
		this.setPosition(i);
	}

	public int getNumberOfCheckers() {
		return checkers.size();
	}

	protected void addCheckerToPip(Checker checker) {

		if (this.getNumberOfCheckers() >= 2 //check if pip is blocked by other player
				&& !checker.getOwner().equals(checkers.get(0).getOwner()) && !(this instanceof Bar)) {
			System.out
					.println("Unable to move checker. Pip is owned by other player");
			return;
		} else
			checkers.add(checker); //add checker to checkers on new pip
			checker.getCurrentPip().removeCheckerFromPip(checker); //remove checker from checkers on old pip
	}

	private void removeCheckerFromPip(Checker checker) {
		if (checkers.contains(checker)) {
			checkers.remove(checker);
		} else
			System.out
					.println("Unable to remove checker; checker not foud on pip");
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
