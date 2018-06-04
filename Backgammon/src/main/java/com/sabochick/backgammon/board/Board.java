package com.sabochick.backgammon.board;

import java.util.ArrayList;

public class Board {
	
	static final int NUM_OF_PIPS = 25; //24 normal pips plus bar
	static final int NUM_OF_CHECKERS = 15;
	static final int NUM_OF_PLAYERS = 2;
	static final int NUM_OF_DICE = 2;
	
	ArrayList<Checker> checkers = new ArrayList<Checker>();
	ArrayList<Player> players = new ArrayList<Player>();
	ArrayList<Die> dice = new ArrayList<Die>();
	ArrayList<Pip> pips = new ArrayList<Pip>();
	
	public Board(){
		initializePlayers();
		initializePips();
		initializeCheckers();
		
	}
	
	private void initializePlayers() {
		players.add(new PlayerOne());
		players.add(new PlayerTwo());
	}

	private void initializePips(){
		for(int i = 0; i < NUM_OF_PIPS; i++){
			if(i == 0){
				pips.add(new Bar(i));
			}
			else pips.add(new Pip(i));
		}
	}
	
	private void initializeCheckers(){ //give each player 15 checkers, checkers are not placed on any pip
		for(Player p : players){
			for(int i = 0; i < NUM_OF_CHECKERS; i ++){
				Checker checker = new Checker();
				checker.setOwner(p);
			}
		}
		
	}
}
