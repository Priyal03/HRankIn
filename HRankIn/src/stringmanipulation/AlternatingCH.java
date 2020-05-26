package stringmanipulation;

import java.util.Scanner;

public class AlternatingCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while (test-- > 0) {
			String string = scanner.next();
			int count = 0, len = string.length() - 1;
			for (int i = 0; i < len; i++) {

				if (string.charAt(i) == string.charAt(i + 1)) {
					count++;
				}

			}

			System.out.println(count);
		}
	}
}
