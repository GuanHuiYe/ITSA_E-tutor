package 遞迴_Recursionc;

import java.util.*;

public class C_RU07_易_電路板溫度升高問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input = sc.nextLine().split(",");
			System.out.printf("%.4f\n", GetT(Double.parseDouble(input[0]), Double.parseDouble(input[1])));
		}

	}

	public static double GetT(Double base, Double i) {
		if (i == 0)
			return base;
		return GetT(base, i - 1) + i * 2.71828;
	}

}
