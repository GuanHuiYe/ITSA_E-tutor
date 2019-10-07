package 字串_Stringsc;

import java.util.*;

public class C_ST33_易_英文字的分數 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		int ans = 0;
		for (char item : input) {
			ans += Character.toLowerCase(item) - 96;
		}
		System.out.println(ans);

	}

}
