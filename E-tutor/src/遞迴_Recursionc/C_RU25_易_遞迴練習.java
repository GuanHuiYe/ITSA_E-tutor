package »¼°j_Recursionc;

import java.util.*;

public class C_RU25_©ö_»¼°j½m²ß {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		System.out.printf("%d %d\n", GetF(input), GetG(input));
	}

//	f(n)¡×3f(n-1)+g(n-1)
	public static int GetF(int n) {
		if (n == 1)
			return 2;
		return 3 * GetF(n - 1) + GetG(n - 1);
	}

	// g(n)¡×-f(n-1)+g(n-1)
	public static int GetG(int n) {
		if (n == 1)
			return -6;
		return (GetF(n - 1) * -1) + GetG(n - 1);
	}
}
