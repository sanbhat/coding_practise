package algo.sort;

import java.util.Arrays;

/**
 * <b>Bubble sort</b> is one of the most basic and simple to understand sorting algorithms. The
 * <b>Time complexity</b> of this algorithm is <code>O (n ^ 2) </code>, because it requires
 * a for loop with a for loop to compare each element with its adjacent one.
 * <p>
 * Hence, this algorithm is NOT usable for large scale applications and is only usable in academia.
 * 
 * @author santhosh
 *
 */
public class BubbleSort {
	
	/**
	 * Sorts the elements of the array by comparing each elements with its adjacent elements
	 * and swapping the two, if the element in the lower index is greater than the adjacent element with higher index.
	 * @param input - input array
	 */
	public void sort(int[] input) {
		int n = input.length;
		
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(input[i] > input[j]) {
					swap(input, i, j);
				}
			}
		}
	}

	/**
	 * Swaps the elements within array. Remember even though, Java is pass by value, in case of 
	 * <code>int[]</code>, the copy of "reference" to the <code>int[]</code> will be passed to the <code>swap</code> method.
	 * Hence, the modification done to the array will reflect in the original array (which is parameter to the <code>sort</code> method)
	 * @param array 
	 * @param i
	 * @param j
	 */
	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1, 10, 99, 87, 6, 78, -1, -12, 100, 65, 120};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}