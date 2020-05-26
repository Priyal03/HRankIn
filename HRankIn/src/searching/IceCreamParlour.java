package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IceCreamParlour {

	// Complete the whatFlavors function below.
	static void whatFlavors(int[] cost, int money) {

    	List<Integer> list = Arrays.stream(cost).boxed().collect(Collectors.toList());
    			
    	//list.forEach(p->System.out.print(p));
    	
        for(int i=0;i<cost.length;i++){

        	int c=cost[i];
            if(c<money){
                
            	int diff = money - c;

                if(list.contains(diff)){
                	System.out.println(list.indexOf(c)+" "+list.indexOf(diff));
                	break;
                }
            }
        }
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int money = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] cost = new int[n];

			String[] costItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int costItem = Integer.parseInt(costItems[i]);
				cost[i] = costItem;
			}

			whatFlavors(cost, money);
		}

		scanner.close();
	}
}
