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
public class GlobalTypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length > 0) {
			startGLobalTypes();

			List<GlobalType> globalTypes = new ArrayList<GlobalType>();

			for (String globalTypeString : args) {
				GlobalType globalType = GlobalTypeModule.createGlobalType(globalTypeString);

				if (globalType != null) {
					globalTypes.add(globalType);
				}

			}

			for (GlobalType globalType : globalTypes) {
				globalType.display();
			}

		} else {
			System.out.println("No Arguments Supplied");
		}

	}

	private static void startGLobalTypes() {

		GlobalTypeModule.addGlobalType(new AlphaGlobalType());
		GlobalTypeModule.addGlobalType(new BetaGlobalType());
		GlobalTypeModule.addGlobalType(new ReleaseGlobalType());

	}

}
