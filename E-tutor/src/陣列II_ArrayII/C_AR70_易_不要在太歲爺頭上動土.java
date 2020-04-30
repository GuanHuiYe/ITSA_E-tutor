package 陣列II_ArrayII;

import java.util.*;

public class C_AR70_易_不要在太歲爺頭上動土 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ans = new String[] { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon",
				"snake", "horse", "goat" };
		int year = Integer.parseInt(sc.nextLine()) % 12;
		System.out.println(ans[year] + "\n" + ans[year >= 6 ? year - 6 : year +6]);
	}

}
