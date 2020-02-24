package com.game.tennis;

import com.game.tennis.pojo.Player;

/**
 * This class has the business logic related to Tennis Game
 * @author 2020-DEV-047
 *
 */
public class TennisGame {
	
	/**
	 * Adds scores to a player's account
	 * @param player - A Player data type
	 */
	public void addScorePoint(Player player) {
		player.setPoints(player.getPoints() + 1);
	}

}
