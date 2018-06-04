package com.sabochick.backgammon.board;

public class Checker {
	private Pip currentPip;
	private Player owner;

	public void moveChecker(Pip pip) {
		if (currentPip.equals(pip)) {
			System.out.println("Invalid move: checker already on target pip");
			return;
		}
		pip.addCheckerToPip(this);
	}

	public Pip getCurrentPip() {
		return this.currentPip;
	}

	public int getPosition() {
		return currentPip.getId();
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

}
