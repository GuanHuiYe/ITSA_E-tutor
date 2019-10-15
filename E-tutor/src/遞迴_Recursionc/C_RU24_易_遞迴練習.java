package »¼°j_Recursionc;

import java.util.*;

public class C_RU24_©ö_»¼°j½m²ß {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%.5f\n", GetF(Integer.parseInt(sc.nextLine())));
	}

//f(n)¡×2f(n-1)/(1+2f(n-1))
	public static double GetF(int n) {
		if (n == 1)
			return 2;
		double num = GetF(n - 1);
		return (2.0 * num / (1 + 2.0 * num));
	}

}
