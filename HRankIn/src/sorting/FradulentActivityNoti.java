package sorting;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class FradulentActivityNoti {
	
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int d = scanner.nextInt();
		int[] expenditure = new int[n];

		for (int i = 0; i < n; i++) {
			expenditure[i] = scanner.nextInt();
		}
		
		int result = 0, pass = expenditure.length - d, start = 0;
//		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
//		
//		while(start++<d) {
//			minHeap.offer(expenditure[start]);
//		}
		
		while (pass-- > 0) {

			int arr[] = Arrays.copyOfRange(expenditure, start, start + d);
			int index = d / 2;
			double median = 0;
			
			if (d % 2 == 0) {
				median = (arr[index] + arr[index - 1]) / 2.0;
			} else {
				median = arr[index];
			}
			double nextElement = expenditure[d];
			if (nextElement >= (median * 2)) {
					result++;
				//System.out.println(result++);
			}
			start++;
		}
		System.out.println(result);
		scanner.close();
	}
}

