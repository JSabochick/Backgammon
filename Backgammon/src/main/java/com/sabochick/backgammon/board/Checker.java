package com.sabochick.backgammon.board;

public class Checker {
	private Pip currentPip;
	private Player owner;

	// handles all changes needed to move a checker from one pip to another
	// should remove checker from currentPip.checkers, add it to
	// targetPip.checkers, and update checker.currentPip
	public void moveChecker(Pip pip) {
		if (currentPip.equals(pip)) {
			System.out.println("Invalid move: checker already on target pip");
			return;
		}
		pip.addCheckerToPip(this);
		this.setCurrentPip(pip);
	}

	public Pip getCurrentPip() {
		return this.currentPip;
	}

	protected void setCurrentPip(Pip pip) {
		this.currentPip = pip;
	}

	public int getPosition() {
		return currentPip.getPosition();
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

}
