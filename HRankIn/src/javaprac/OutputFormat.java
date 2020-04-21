package javaprac;

import java.util.Scanner;

public class OutputFormat {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 3; i++) {
//			String s1 = sc.next();
//			int x = sc.nextInt();
//			// Complete this line
//			System.out.printf("%-15s%03d\n", s1, x);
//
//		}

		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (sc.hasNext()) {
			System.out.println(count + " " + sc.nextLine());
			if (sc.hasNext("end-of-file")) {
				break;
			}
			count++;
		}
	}
}