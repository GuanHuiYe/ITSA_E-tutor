package 數學_Mathematics;

import java.util.*;
import java.math.*; 

public class C_MM30_易_質數判別 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger input = new BigInteger(sc.nextLine());
		if (is_prime(input))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

	public static Boolean is_prime(BigInteger n) {
		if (n.compareTo(new BigInteger("2")) == -1)
			return false;
		if (n.compareTo(new BigInteger("2")) == 0)
			return true;
		if ( n.mod(new BigInteger("2")).compareTo(BigInteger.ZERO) == 0)
			return false;
//		for (BigInteger nth = new BigInteger("3"); nth.compareTo(n.sqrt()) == -1; nth.add(BigInteger.ONE)) {
//			if (n.mod(nth).compareTo(BigInteger.ZERO) == 0)
//				return false;
//
//		}
		return true;

	}
	
	
	

}
