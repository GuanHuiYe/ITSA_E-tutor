package 遞迴_Recursionc;

import java.util.*;
import java.math.*;

public class C_RU01_易_矩陣練習 {
	public static TreeMap<Integer, BigInteger> Factorial;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Factorial = new TreeMap<Integer, BigInteger>();
		Factorial.put(0,BigInteger.valueOf(1));
		Factorial.put(1, BigInteger.valueOf(1));
		Factorial.put(2, BigInteger.valueOf(2));
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			System.out.println(GetFactorial(Integer.parseInt(sc.nextLine())));
		}

	}

	public static BigInteger GetFactorial(int num) {
		if (Factorial.containsKey(num))
			return Factorial.get(num);
		return BigInteger.valueOf(num).multiply(GetFactorial(num - 1));
	}

}
