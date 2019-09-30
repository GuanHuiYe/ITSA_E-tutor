package 數學_Mathematics;

import java.util.*;

public class C_MM33_易_找1到N的完美數 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNum = Integer.parseInt(sc.nextLine());
		int n = 1;
		String ans = "";
		while (true) {
			if (is_prime(n)) {
				int perfect_number = (int) ((Math.pow(2, n) - 1) * Math.pow(2, n - 1));
				if (perfect_number > maxNum) {
					System.out.println(ans.substring(0, ans.length() - 1));
					break;
				} else
					ans += perfect_number + " ";
			}
			n++;
		}
	}

	public static Boolean is_prime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int nth = 3; nth < Math.sqrt(n); nth++) {
			if (n % nth == 0)
				return false;

		}
		return true;

	}

}
