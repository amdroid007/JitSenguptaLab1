/**
 * 
 */
package edu.fiu.cardgame;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author coblab
 *
 */
public class Card implements SelfCheckCapable {

	int value;
	int suit;
	
	public Card(int s, int v) {
		// TODO Auto-generated constructor stub
		suit = s; value = v;
	}

	/**
	 * Shows the card on the display
	 */
	void show() {
		
	}
	
	/**
	 * Flips the card so it cannot be seen
	 */
	void flip() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Suit " + suit + " Value " + value;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
