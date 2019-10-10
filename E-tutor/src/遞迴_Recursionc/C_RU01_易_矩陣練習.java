package »¼°j_Recursionc;

import java.util.*;
import java.math.*;

public class C_RU01_©ö_¯x°}½m²ß {
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
