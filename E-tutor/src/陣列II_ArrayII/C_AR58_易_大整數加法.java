package 陣列II_ArrayII;

import java.math.BigInteger;
import java.util.*;

public class C_AR58_易_大整數加法 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input = sc.nextLine().split(" ");
			System.out.println((new BigInteger(input[0])).add(new BigInteger(input[1])));

		}

	}

}
