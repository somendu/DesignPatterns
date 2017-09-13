/**
 * 
 */
package com.somendu.design.singleton;

/** <Description>
 * 
 * @author Somendu Maiti<smaiti@scan-it.com.sg>
 * @since Sep 13, 2017 */
public class ManifestSingleton {

	private static final ManifestSingleton manifestSingleton = new ManifestSingleton();

	private ManifestSingleton() {

	}

	public static ManifestSingleton getManifestSingleton() {
		return manifestSingleton;
	}

	public String printHelloWorld() {

		return "Hello World";
	}
}
