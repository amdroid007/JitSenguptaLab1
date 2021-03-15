/**
 * 
 */
package edu.fiu.cardgame;

/**
 * @author coblab
 *
 */
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck mydeck = new Deck();
		mydeck.shuffle();
		mydeck.runSelfCheck();
	}

}
