package �}�C_Array;

import java.util.*;

public class C_AR44_��_�j����D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String in = sc.nextLine();
		boolean test = true;

		for (int n = 0; n < in.length() / 2; n++) {
			if (in.substring(n, n + 1).equals(in.substring(in.length() - n - 1, in.length() - n))) {
				test = true;
			} else {
				test = false;
				break;
			}
		}

		if (test) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
