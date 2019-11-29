package 數學II_MathematicsII;

import java.math.BigInteger;
import java.util.*;

public class C_MM062_易_計算數字相乘後末尾0的數量 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger ans = BigInteger.ONE;
		while (sc.hasNext()) {
			BigInteger input = new BigInteger(sc.nextLine());
//			if (input.equals(BigInteger.ZERO))
//				break;
			ans = ans.multiply(input);
		}
		String ansStr = String.valueOf(ans);
		int count = 0;
		for (int index = ansStr.length() - 1; index >= 0; index--) {
			if (ansStr.subSequence(index, index + 1).equals("0"))
				count++;
		}
		System.out.println(count);

	}

}
