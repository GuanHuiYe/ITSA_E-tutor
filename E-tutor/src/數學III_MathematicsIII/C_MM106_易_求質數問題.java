package 數學III_MathematicsIII;

import java.util.*;

public class C_MM106_易_求質數問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int num = Integer.parseInt(sc.nextLine()); num >= 2; num--) {
			if (is_prime(num)) {
				System.out.println(num);
				break;
			}
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
