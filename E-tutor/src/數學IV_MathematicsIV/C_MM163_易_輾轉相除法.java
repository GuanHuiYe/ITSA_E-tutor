package �ƾ�IV_MathematicsIV;

import java.util.*;

public class C_MM163_��_����۰��k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			System.out.println(gcd(sc.nextInt(), sc.nextInt()));
		}

	}

	public static int gcd(int m, int n) {
		if (n == 0)
			return m;
		else
			return gcd(n, m % n);
	}
}
