/**
 * 
 */
package com.somendu.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Somendu
 *
 */
public class GlobalTypeModule {

	private static List<GlobalType> globalTypes = new ArrayList<GlobalType>();

	public static void addGlobalType(GlobalType gtype) {
		globalTypes.add(gtype);
	}

	public static GlobalType createGlobalType(String name) {
		for (GlobalType globalType : globalTypes) {
			if (globalType.getName().equals(name)) {
				return globalType.getGlobal();
			}
		}

		System.out.println(name + ": does not exist");
		return null;
	}
}
