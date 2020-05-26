package stringmanipulation;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SherlockValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();

		List<Character> list = string.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

		Map<Character, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Set<Long> set=new HashSet<>();
		for (Long value : map.values()) {
			set.add(value);
		}//adding only frequencies.

		if(set.size()>2) {
			System.out.println("NO");
		}else if(set.size()==1){
			System.out.println("YES");
		}else {
			
		}
	}
}
//If all have the same frequency
//If only 1 character has a frequency that is  greater than all others
//If all have the same frequency except 1 element which has a frequency of 1