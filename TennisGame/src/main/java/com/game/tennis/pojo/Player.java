package com.game.tennis.pojo;

/**
 * This class has the player information
 * @author 2020-DEV-047
 *
 */
public class Player {

	private String name;
	private int points;

	public Player(String playerName) {
		this.name = playerName;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
