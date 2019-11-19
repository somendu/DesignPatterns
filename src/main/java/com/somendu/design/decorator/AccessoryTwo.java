/**
 * 
 */
package com.somendu.design.decorator;

/**
 * @author somendu
 *
 */
public class AccessoryTwo extends Gun {

	public void fire() {

		super.fire();

		doAccessoryTwoWithGun();
	}

	private void doAccessoryTwoWithGun() {

		System.out.println("Accessor Two with Gun");

	}

}
