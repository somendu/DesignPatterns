/**
 * 
 */
package com.somendu.design.builder;

/**
 * @author Somendu
 *
 */
public class BurgerImpl implements Burger {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.somendu.design.builder.Burger#createBurger()
	 */
	@Override
	public String createBurger() {
		String miniBurger = "Mini Burger";
		return miniBurger;
	}

}
