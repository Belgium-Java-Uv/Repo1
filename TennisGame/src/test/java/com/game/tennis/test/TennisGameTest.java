package com.game.tennis.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.game.tennis.TennisGame;
import com.game.tennis.pojo.Player;
import com.game.tennis.util.TennisGameConstants;

/**
 * The class is used to check/test the functionalities in TennisGame 
 *   
 * @author 2020-DEV-047
 * 
 */

public class TennisGameTest {
	
	/**
	 * Test case to add points scored by a player to his/her account
	 * points{0,1,2,3..} These values correspond to {LOVE,FIFTEEN,THIRTY,FORTY,DEUCE,ADVANTAGE,WINNER}
	 */
	@Test
	public void testAddScorePoint() {
		Player player = new Player(TennisGameConstants.PLAYER_1);
		TennisGame tennisGame = new TennisGame();
		
		tennisGame.addScorePoint(player);
		assertEquals(1,player.getPoints());
	}
	
}
