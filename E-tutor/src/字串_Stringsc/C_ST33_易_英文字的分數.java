package �r��_Stringsc;

import java.util.*;

public class C_ST33_��_�^��r������ {

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
