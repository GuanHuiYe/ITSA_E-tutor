package 字串_Stringsc;

import java.util.*;

public class C_ST36_易_列舉迴文數 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(is_Palindrome(input)) {
			System.out.println(input);
			return;
		}
		int nth = 0;
		while (++nth <= 50) {
			int a = Integer.parseInt(input);
			String reverse = "";
			for (char item : input.toCharArray()) {
				reverse = String.valueOf(item) + reverse;
			}
			int b = Integer.parseInt(reverse);
			System.out.println(a + "+" + b + "=" + (a + b));
			
			input = String.valueOf(a + b);
			if (is_Palindrome(String.valueOf(a+b)))
				break;

		}

	}
	public static Boolean is_Palindrome(String s) {
		Boolean test = true;
		char[] str = s.toCharArray();
		for (int index = 0; index < str.length / 2; index++) {
			if (str[index] != str[str.length - 1 - index]) {
				test = false;
				break;
			}
		}
		return test;
	}

}
