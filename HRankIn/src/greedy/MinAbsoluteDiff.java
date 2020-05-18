package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * so here we wanted to calculate the min absolute difference between all the array elements. 
 * My brute force approach was to find distinct pairs of array elements.
 * get the minimum element from calculation from inner loop.
 *  
 *  other way from discussions I got to know that.. I can just sort the array and find the difference between pairs.
 *  That will basically be the minimum among all once we traverse whole array.
 */
public class MinAbsoluteDiff {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		int t = 0;

		while (t < n) {
			arr[t] = sc.nextInt();
			t++;
		}

		List<String> list = findPairs(arr, n);

		list.forEach(x -> System.out.println(x));

		Arrays.sort(arr);

		int min = arr[n - 1];

		for (int i = 1; i < n; i++) {

			int diff = arr[i] - arr[i - 1];
			diff = Math.abs(diff);

			if (diff < min)
				min = diff;

		}
		System.out.println(min);
	}

	private static List<String> findPairs(int[] arr, int n) {

		List<String> map = new ArrayList<String>();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				map.add(arr[i] + "," + arr[j]);
			}
		}
		return map;
	}

}
