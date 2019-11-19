/**
 * 
 */
package com.somendu.design.decorator;

/**
 * @author somendu
 *
 */
public class SubSubAccessoryOne extends AccessoryOne {

	private AccessoryTwo subAccessoryTwo = new AccessoryTwo();

	public void doSubSubAccessoryOne() {
		super.fire();
		subAccessoryTwo.fire();
	}

}
