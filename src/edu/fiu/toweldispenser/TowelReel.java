/**
 * 
 */
package edu.fiu.toweldispenser;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author coblab
 *
 */
public class TowelReel implements SelfCheckCapable {
	Motor mymotor;
	
	public TowelReel() {
		mymotor = new Motor();
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	public void loadTowels() {
		// TODO Auto-generated method stub
		System.out.println("Loaded towels");
	}

	public void operateReel() {
		// TODO Auto-generated method stub
		dispenseTowel();
	}

	private void dispenseTowel() {
		// TODO Auto-generated method stub
		System.out.println("Dispensing towel");
		mymotor.run(2);
	}

}