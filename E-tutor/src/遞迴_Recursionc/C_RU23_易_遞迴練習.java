package »¼°j_Recursionc;

import java.util.*;

public class C_RU23_©ö_»¼°j½m²ß {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%.5f\n", GetF(Integer.parseInt(sc.nextLine())));
	}

//2f(n)=f(n-1)+2
	public static double GetF(int n) {
		if (n == 1)
			return 1;
		return (GetF(n - 1) + 2) / 2.0;
	}

}
