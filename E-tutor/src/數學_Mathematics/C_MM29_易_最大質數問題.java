package 數學_Mathematics;

import java.util.*;

public class C_MM29_易_最大質數問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		for(int n=input-1;n>0;n--) {
			if(is_prime(n)) {
				System.out.println(n);
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
		for (int nth = 3; nth < Math.sqrt(n); nth++) {
			if (n % nth == 0)
				return false;

		}
		return true;

	}

}
