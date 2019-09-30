package 數學_Mathematics;

import java.util.*;
import java.math.*; 

public class C_MM30_易_質數判別 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		if (is_prime(input))
			System.out.println("YES");
		else
			System.out.println("NO");

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
