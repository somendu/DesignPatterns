/**
 * 
 */
package com.somendu.design.builder;

/**
 * @author Somendu
 *
 */
public class Waiter implements Burger, ApplePie, ColdDrink {

	public String takeOrder() {
		String order = "";

		order = createBurger() + "\n" + fillColdDrink() + "\n" + createPie();

		return order;
	}

	@Override
	public String fillColdDrink() {

		ColdDrinkImpl coldDrink = new ColdDrinkImpl();

		String coldDrinkString = coldDrink.fillColdDrink();

		return coldDrinkString;

	}

	@Override
	public String createPie() {
		ApplePieImpl applePie = new ApplePieImpl();

		String applePieString = applePie.createPie();

		return applePieString;
	}

	@Override
	public String createBurger() {
		BurgerImpl burger = new BurgerImpl();

		String burgerString = burger.createBurger();

		return burgerString;
	}

}
