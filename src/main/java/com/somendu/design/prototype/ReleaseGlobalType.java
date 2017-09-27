/**
 * 
 */
package com.somendu.design.prototype;

/**
 * @author Somendu
 *
 */
public class ReleaseGlobalType implements GlobalType {

	private String name = "ReleaseGlobalType";

	@Override
	public GlobalType getGlobal() {

		return new ReleaseGlobalType();
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public void display() {
		System.out.println(name + " is the final stage");
	}
}
