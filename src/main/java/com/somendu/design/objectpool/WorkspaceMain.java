/**
 * 
 */
package com.somendu.design.objectpool;

/**
 * @author Somendu
 *
 */
public class WorkspaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee employee = new Employee();

		int warehouseCount = Integer.parseInt(args[0]);
		int storeCount = Integer.parseInt(args[1]);

		String employeeResult = "";
		String countString = "";
		if (storeCount > 0) {
			Store.getStore().setCount(storeCount - 1);

			Store.getStore().setCount(storeCount);
			employeeResult = employee.getEqipment("Store");
			countString = "Store count now " + storeCount;

		} else if (storeCount == 0) {
			Warehouse.getWarehouse().setCount(warehouseCount - 1);
			warehouseCount--;
			employeeResult = employee.getEqipment("Warehouse");
			countString = "Warehouse count now " + warehouseCount;
		}

		System.out.println(employeeResult);
		System.out.println(countString);

		storeCount--;
	}

}
