package warmup;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
/**
 * 
 * @author coder
 * I thought of implementing the same logic with List and array but it had became cumbersome to implement removal as well as keeping tack of data
 * which was very efficient in the case of Stack which again takes the same amount of time while checking the element present or not.
 */
public class StockMerchant {

    static int sockMerchant(int n, int[] ar) {
    	
    	int co=0;
    	Stack<Integer> stack = new Stack<>();
    	
    	for(int i=0;i<ar.length;i++) {
    		stack.add(ar[i]);
    	}
    	
    	for(int i=0;i<ar.length;i++) {
    		
    		int now=0;
    		if(!stack.isEmpty())
    			now = stack.pop();
    		
    		if(stack.remove(Integer.valueOf(now))) {
    			co++;
    		}
    	}
    	return co;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = scanner.nextInt();
		}

		
        int result = sockMerchant(n, ar);

        System.out.println(result);
        scanner.close();
    }
}
