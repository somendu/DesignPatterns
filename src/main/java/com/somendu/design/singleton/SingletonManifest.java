/**
 * 
 */
package com.somendu.design.singleton;

/** <Description>
 * 
 * @author Somendu Maiti<smaiti@scan-it.com.sg>
 * @since Sep 13, 2017 */
public class SingletonManifest {

	/** @param args */
	public static void main(String[] args) {

		String newString = ManifestSingleton.getManifestSingleton()
				.printHelloWorld();

		System.out.println("New String from Singleton " + newString);
	}

}
