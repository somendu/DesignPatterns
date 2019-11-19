/**
 * 
 */
package com.somendu.design.decorator;

/**
 * @author somendu
 *
 */
public class AccessoryOne extends Gun {

	public void fire() {

		super.fire();

		doAccessoryOneWithGun();

	}

	private void doAccessoryOneWithGun() {

		System.out.println("Accessory One with Gun");

	}

}
