/**
 * 
 */
package tech.niyama.algorithms.sorting;

import java.util.Arrays;

/**
 * @author SaiKishan
 *
 */
public class SelectionSortAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = { -2, 45, 0, 11, -9 };
		System.out.println(Arrays.toString(sortData(data)));
	}

	/**
	 * Selection Sort :
	 * Finding the minimum Element & Swapping the minimum
	 * 		element to the Front.
	 * @param data
	 * @return
	 */
	private static int[] sortData(int[] data) {
		int arrLen = data.length;
		for(int i=0;i<arrLen;i++) {
			   int temp;
			   int minIndx =i;
			for(int j=i+1;j<arrLen;j++) {
				if(data[j]<data[minIndx])
					minIndx = j;
				
			}
			temp = data[minIndx];
			data[minIndx] = data[i];
			data[i] = temp;
		}
		
		return data;
	}

}
