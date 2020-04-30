package 數學IV_MathematicsIV;

import java.util.*;

public class C_MM167_易_質數輸出 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			if (start == 0 && end == 0)
				break;
			while (start <= end) {
				if (is_prime(start))
					System.out.print(start + " ");
				start++;
			}
			System.out.println();
		}

	}

	public static Boolean is_prime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int nth = 3; nth <= Math.sqrt(n); nth++) {
			if (n % nth == 0)
				return false;

		}
		return true;

	}

}
