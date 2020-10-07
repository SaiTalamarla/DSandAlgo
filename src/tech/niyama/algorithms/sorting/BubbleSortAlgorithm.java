/**
 * 
 */
package tech.niyama.algorithms.sorting;

import java.util.Arrays;

/**
 * @author SaiKishan
 *
 */
public class BubbleSortAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = { -2, 45, 0, 11, -9 };
		System.out.println(Arrays.toString(sortData(data)));
	}

	/**Bubble Sort :
	 * Finding the maximum Element & Swapping the minimum
	 * 		element to the Rear.
	 * @param data
	 * @return
	 */
	private static int[] sortData(int[] data) {
		int arrLen = data.length;
		// Moving the highest value element to the Last
		// using swapping

		for (int i = 0; i < arrLen - 1; i++) {
			for (int j = 0; j < arrLen - i - 1; j++) {
				int temp;
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}

		}
		return data;
	}

}
