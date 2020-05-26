package stringmanipulation;

import java.util.HashMap;
import java.util.Scanner;

public class MakeAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		char[] string1 = scanner.next().toCharArray();
		char[] string2 = scanner.next().toCharArray();
		
		HashMap<Character, Integer> countMap 
        = new HashMap<Character, Integer>(); 
		
		for(char x:string1) {
			
			countMap.computeIfPresent(x, (a,v)->v+1);
			countMap.computeIfAbsent(x, (y)->1);
		}
		int count=0;
		for(char x:string2) {
			
			int value = countMap.get(x);
			if(value>0) {
				countMap.put(x, value-1);
			}else {
				count++;
				
			}
		}
		for(int x:countMap.values()) {
			
			if(x>0) {
				count=count+x;
			}
		}
		System.out.println(count);
	}

}
