package 字串II_StringsII;

import java.util.*;

public class C_ST62_易_縮寫很方便 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			String ans = "";
			for (String item : input) {
				if (!Character.isLowerCase( item.toCharArray()[0]))
					ans += item.substring(0, 1).toUpperCase();
			}
			System.out.println(ans);
		}

	}

}
