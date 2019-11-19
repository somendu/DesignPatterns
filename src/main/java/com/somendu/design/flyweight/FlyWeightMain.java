/**
 * 
 */
package com.somendu.design.flyweight;

/**
 * @author somendu
 *
 */
public class FlyWeightMain {

	public static final int ROWS = 6, COLS = 10;

	public static void main(String[] args) {

		RowColDisplay[][] matrix = new RowColDisplay[ROWS][COLS];

		for (int i = 0; i < ROWS; i++) {

			for (int j = 0; j < COLS; j++) {

				matrix[i][j] = new RowColDisplay(COLS);

			}
		}

		for (int i = 0; i < ROWS; i++) {

			for (int j = 0; j < COLS; j++) {

				matrix[i][j].report();

			}

			System.out.println();
		}
	}

}
