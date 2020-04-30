package 字串_Stringsc;

import java.util.*;

public class C_ST25_易_編碼器 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		int shift = Integer.parseInt(sc.nextLine());
		ans += String.valueOf(shift) + "\n";
		int Decode = Integer.parseInt(sc.nextLine());
		ans += String.valueOf(Decode) + "\n";
		while (sc.hasNext()) {
			if (Decode == 1)
				shift *= -1;
			char[] input = sc.nextLine().toCharArray();
			for (char item : input) {
				if (Character.isUpperCase(item)) {
					item += shift;
					if (item > 'Z')
						item -= 'Z' - 'A' + 1;
					else if (item < 'A')
						item += 'Z' - 'A' + 1;
				} else {
					item += shift;
					if (item > 'z')
						item -= 'z' - 'a' + 1;
					else if (item < 'a')
						item += 'z' - 'a' + 1;
				}
				ans += item;
//				System.out.print(item);
			}
			ans += "\n";
//			System.out.println();
		}
		System.out.print(ans);

	}

}
