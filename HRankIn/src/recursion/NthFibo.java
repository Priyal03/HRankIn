package recursion;

import java.util.Scanner;

public class NthFibo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));

	}
//0 1 1 2 3 5 8
	private static int fibonacci(int n) {
		
		int fibo = 0, first = 1, rs=fibo+first;
		
		while(n-->1) {
			fibo=first;
			first=rs;
			rs=fibo+first;
		}
		return first;
	}

}
