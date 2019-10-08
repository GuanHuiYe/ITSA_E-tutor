package 陣列II_ArrayII;

import java.util.*;

public class C_AR68_易_天地時刻 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ans = new String[] { "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "goat", "monkey",
				"rooster", "dog", "pig", "rat" };
		System.out.println(ans[(Integer.parseInt(sc.nextLine().split(" ")[0]) + 1) / 2]);
	}

}
