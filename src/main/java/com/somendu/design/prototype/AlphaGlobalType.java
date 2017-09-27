/**
 * 
 */
package com.somendu.design.prototype;

/**
 * @author Somendu
 *
 */
public class AlphaGlobalType implements GlobalType {

	private String name = "AlphaGlobalType";

	@Override
	public GlobalType getGlobal() {

		return new AlphaGlobalType();
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public void display() {
		System.out.println(name + " is the first stage");
	}

}
