package °}¦CII_ArrayII;

import java.util.*;

public class C_AR52_©ö_¦C¦L¤T¨¤§Î {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		String[][] ans = new String[size][size * 2 - 1];

		for (int y = 0; y < ans.length; y++) {

			for (int x = 0; x <= ans[y].length / 2; x++) {
				if (size - y - 1 > x || ans.length / 2 < y && y < x) {
					ans[y][x] = "@";
					ans[y][ans[y].length - x - 1] = "@";

				} else {
					ans[y][x] = "*";
					ans[y][ans[y].length - x - 1] = "*";
				}
			}

		}

		for (int y = 0; y < ans.length; y++) {
			for (int x = 0; x < ans[y].length; x++) {
				System.out.print(ans[y][x]);
			}
			System.out.println();
		}
	}

}
