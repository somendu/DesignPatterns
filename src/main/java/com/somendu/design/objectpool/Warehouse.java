/**
 * 
 */
package com.somendu.design.objectpool;

/**
 * @author Somendu
 *
 */
public class Warehouse {

	public int count = 12;

	private static final Warehouse warehouse = new Warehouse();

	public static Warehouse getWarehouse() {
		return warehouse;
	}

	public String getEquipment() {
		return "Equipment Available in Warehouse";
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
}
