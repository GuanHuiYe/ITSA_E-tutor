package 陣列_Array;

import java.util.*;

public class C_AR35_易_生肖問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] map = new String[] { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon",
				"snake", "horse", "sheep" };
		System.out.println(map[Integer.parseInt(sc.nextLine()) % 12]);
	}

}
