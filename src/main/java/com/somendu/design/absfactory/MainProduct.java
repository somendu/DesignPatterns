/**
 * 
 */
package com.somendu.design.absfactory;

/**
 * @author Somendu
 *
 */
public class MainProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ProductImpl productImpl = new ProductImpl();

		// Main Product only knows platform 1 is getting called
		String platformOne = productImpl.getPlatformOne();

		String platformTwo = productImpl.getPlatformTwo();

		System.out.println("Platform 1 " + platformOne + "\n" + "Platform 2 " + platformTwo);
	}

}
