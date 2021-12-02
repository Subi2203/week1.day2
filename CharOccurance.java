package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		
		int count = 0;
		
		int strLen = str.length();
						
		for (int i = 0; i < strLen; i++) {

			if(str.charAt(i) == 'n') {
			
			count++;
			//count = count + i;
			
		}
		
			
		}
		
		System.out.println(count);
	}

}
