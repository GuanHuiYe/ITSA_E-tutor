package �}�C_Array;

import java.util.*;

public class C_AR35_��_�ͨv���D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] map = new String[] { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon",
				"snake", "horse", "sheep" };
		System.out.println(map[Integer.parseInt(sc.nextLine()) % 12]);
	}

}
