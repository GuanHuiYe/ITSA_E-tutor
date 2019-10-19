package °}¦CII_ArrayII;

import java.util.*;

public class C_AR95_©ö_²q¼Æ¦r {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ans = sc.nextLine().toCharArray();
		while (true) {
			String input = sc.nextLine();
			if (input.equals("0000"))
				break;
			int a = 0;
			int b = 0;
			char[] num = input.toCharArray();
			for (int index = 0; index < num.length; index++) {
				if (ans[index] == num[index])
					a++;
				else {
					for (int n = 0; n < ans.length; n++) {
						if (ans[n] == num[index]) {
							b++;
						}
					}
				}
			}
			System.out.printf("%dA%dB\n", a, b);

		}

	}

}
