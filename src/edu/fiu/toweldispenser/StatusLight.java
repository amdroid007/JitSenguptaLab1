/**
 * 
 */
package edu.fiu.toweldispenser;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author coblab
 *
 */
public class StatusLight implements SelfCheckCapable {

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

	public void flashRed() {
		// TODO Auto-generated method stub
		System.out.println("Light flashing red");
	}

	public void flashGreen() {
		// TODO Auto-generated method stub
		System.out.println("Light flashing green");
		
	}

}
