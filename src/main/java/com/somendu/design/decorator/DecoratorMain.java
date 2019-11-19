/**
 * 
 */
package com.somendu.design.decorator;

/**
 * @author somendu
 *
 */
public class DecoratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gun[] gunArray = { new AccessoryOne(), new SubAccessoryOne(), new SubSubAccessoryOne() };

		for (Gun gun : gunArray) {

			gun.fire();

			System.out.print("  ");
		}

	}

}
