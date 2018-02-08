package algo.sort;

import java.util.Arrays;

/**
 * In <b>Selection Sort</b> we start with first element of the array and replace it with
 * the smallest element in the array. If the smallest element is the first element, then first element
 * is replaced with itself.
 * <p>
 * Then, we move to the second element and we will replace it with the next smallest element in the array and so on...
 * 
 * @author santhosh
 *
 */
public class SelectionSort<T extends Comparable<T>> {

	public void sort(T[] arr) {
		int N = arr.length;
		
		for(int i=0; i<N; i++) {
			int min = i;
			for(int j=i+1; j<N; j++) {
				if(less(arr[j], arr[min])) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}
	
	private void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private boolean less(T a, T b) {
		return a.compareTo(b) < 0;
	}
	
	public static void main(String[] args) {
		Integer[] arr = { 2, 103, 22, -13, 5, -55, 10, 7, 4, 99, 3, -1, 0 };
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		selectionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
