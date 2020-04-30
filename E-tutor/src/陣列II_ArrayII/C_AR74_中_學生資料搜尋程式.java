package 陣列II_ArrayII;

import java.util.*;

public class C_AR74_中_學生資料搜尋程式 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] ans = new String[][] { { "123", "Tom", "DTGD" }, { "456", "Cat", "CSIE" }, { "789", "Nana", "ASIE" },
				{ "321", "Lim", "DBA" }, { "654", "Won", "FDD" } };
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input = sc.nextLine().split(" ");
			for (int y = 0; y < ans.length; y++) {
				if (input[1].equals(ans[y][Integer.parseInt(input[0])-1]))
					System.out.println(ans[y][0] + " " + ans[y][1] + " " + ans[y][2]);
			}
		}

	}

}
