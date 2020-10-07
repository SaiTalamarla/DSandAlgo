/**
 * 
 */
package tech.niyama.algorithms.sorting;

import java.util.Arrays;

/**
 * @author SaiKishan
 *
 */
public class InsertionSortAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = { -2, 45, 0, 11, -9 };
		System.out.println(Arrays.toString(sortData(data)));

	}

	/**
	 * Bubble Sort : Finding the suitable place for unsorted Element in each
	 * Iteration.
	 * 
	 * @param data
	 * @return
	 */
	private static int[] sortData(int[] data) {
		int arrLen = data.length;
		for (int i = 1; i < arrLen; i++) {
			int j = i - 1;
			int keyValue = data[i];

			while (j >= 0 && keyValue < data[j]) {
				data[j + 1] = data[j];
				--j;
			}
			data[j + 1] = keyValue;

		}
		return data;
	}

}
