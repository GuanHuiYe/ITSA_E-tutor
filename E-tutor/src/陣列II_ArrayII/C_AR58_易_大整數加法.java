package �}�CII_ArrayII;

import java.math.BigInteger;
import java.util.*;

public class C_AR58_��_�j��ƥ[�k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input = sc.nextLine().split(" ");
			System.out.println((new BigInteger(input[0])).add(new BigInteger(input[1])));

		}

	}

}
