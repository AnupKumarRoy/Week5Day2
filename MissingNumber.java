package week5day2;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class MissingNumber {

	public static void main(String[] args) {
		int[] numbers= {4,6,7,2,3,1,9,10,8,8,6};
		Set<Integer> NumSet = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			NumSet.add(numbers[i]);
		}
		Set<Integer> numSet2 = NumSet;
		System.out.println(numSet2);
		List<Integer> numList = new ArrayList<Integer>(numSet2);
		for (int i = 0; i < numList.size(); i++) {
			if (i+1!=numList.get(i)) {
				System.out.println(i+1);
				break;
				
			}
		}
		
	}

}
