/**
 * 
 */
package com.somendu.design.builder;

/**
 * @author Somendu
 *
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Waiter waiter = new Waiter();

		System.out.println("Order is here :" + "\n" + waiter.takeOrder());

	}

}
