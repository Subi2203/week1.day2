package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
				
		Arrays.sort(arr);
		
		int len = arr.length;
		
		for (int i = 0; i < len; i++) {
			
			System.out.println("i value is " + (i+1));
			System.out.println("array value is " + arr[i]);
			
			if (arr[i] != (i+1)) {
				System.out.println("Missing element in this array is : "+ (i+1));
				break;
			}
			
		}

	}

}
