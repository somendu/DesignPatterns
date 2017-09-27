/**
 * 
 */
package com.somendu.design.prototype;

/**
 * @author Somendu
 *
 */
public class BetaGlobalType implements GlobalType {

	private String name = "BetaGlobalType";

	@Override
	public GlobalType getGlobal() {

		return new BetaGlobalType();
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public void display() {
		System.out.println(name + " is the second stage");
	}

}
