package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String name = "Madam";
		String nameRev = "";

		int len = name.length();

		for (int i = len-1; i >= 0; i--) {

			char ch = name.charAt(i);
			nameRev = nameRev + ch;

		}
		if (name.equalsIgnoreCase(nameRev) ) {
			
			System.out.println(name+" is a Palindrome");
		}else {
			System.out.println(name+" is not a Palindrome");
		}

	}

}
