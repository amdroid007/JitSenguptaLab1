/**
 * 
 */
package edu.fiu.toweldispenser;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author coblab
 *
 */
public class StatusLight implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Phillips status light indicator";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
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
