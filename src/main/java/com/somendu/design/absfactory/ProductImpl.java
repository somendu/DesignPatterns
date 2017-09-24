/**
 * 
 */
package com.somendu.design.absfactory;

/**
 * @author Somendu
 *
 */
public class ProductImpl implements Product, ProductOne, ProductTwo {

	public String getPlatformOne() {

		// Internally platform 1 is calling 2 products which is not made aware
		// to the main product class

		String platformOne = getProductOnePlatformOne() + getProductTwoPlatformOne();
		return platformOne;
	}

	public String getPlatformTwo() {
		String platformTwo = getProductOnePlatformTwo() + getProductTwoPlatformTwo();
		return platformTwo;
	}

	public String getProductOnePlatformOne() {
		String popo = "\n" + "Product One Platform One";
		return popo;
	}

	public String getProductOnePlatformTwo() {
		String popt = "\n" + "Product One Platform Two";
		return popt;
	}

	public String getProductTwoPlatformOne() {
		String ptpo = "\n" + "Product Two Platform One";
		return ptpo;
	}

	public String getProductTwoPlatformTwo() {
		String ptpt = "\n" + "Product Two Platform Two";
		return ptpt;
	}

}
