package sorting;
//https://github.com/Priyal03/HRankIn.git
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {
	
	// Complete the maximumToys function below.
	static int maximumToys(int[] prices, int k) {

		Arrays.sort(prices);
        int num = 0, i = 0;
        
        while (num < k) {
            
            num += prices[i];
            i++;
        }
        return i-1;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();

		// pass array here
		int arr[] = new int[n];
		int t = 0;

		while (t < n) {
			arr[t] = sc.nextInt();
			t++;
		}

		int result = maximumToys(arr, sum);

		System.out.println(result);
		scanner.close();
	}
}
/**
 * 7 50 1 12 5 111 200 1000 10
 * 
 */
