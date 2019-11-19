/**
 * 
 */
package com.somendu.design.decorator;

/**
 * @author somendu
 *
 */
public class SubAccessoryOne extends AccessoryOne {

	private AccessoryTwo accessoryTwo = new AccessoryTwo();

	public void doSubAccessoryOne()

	{
		super.fire();
		accessoryTwo.fire();
	}
}
