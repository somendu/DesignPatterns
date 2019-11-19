/**
 * 
 */
package com.somendu.design.flyweight;

/**
 * @author somendu
 *
 */
public class RowColDisplay {

	private static int num = 0;

	private int row, col;

	public RowColDisplay(int maxPerRow) {

		row = num / maxPerRow;

		col = num % maxPerRow;

		num++;
	}

	void report() {

		System.out.print(" " + row + col);
	}
}
