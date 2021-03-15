/**
 * 
 */
package edu.fiu.cardgame;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is my fancy Deck class
 * @author coblab
 *
 */
public class Deck implements SelfCheckCapable {
	String brand;
	String material;
	/** Array that holds 52 cards **/ Card[] cards = new Card[52];
	
	/**
	 * This is shuffle method - it takes the cards and
	 * changes the order
	 */
	void shuffle() {
		for(int s=0; s<4; s++) 
			for (int v= 0; v < 13; v++) 
				cards[13*s + v] = new Card(s,v);
	}
	
	/**
	 * A draw that picks the top card from the deck
	 * @return the card that is drawn
	 */
	Card draw() {
		return null;
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My deck";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(cards, this);
	}

}
