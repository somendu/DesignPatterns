/**
 * 
 */
package com.somendu.design.objectpool;

/**
 * @author Somendu
 *
 */
public class Store {

	private int count = 5;

	private static final Store store = new Store();

	public static Store getStore() {
		return store;
	}

	public String getEquipment() {

		return "Equipment Available in Store";
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
}
