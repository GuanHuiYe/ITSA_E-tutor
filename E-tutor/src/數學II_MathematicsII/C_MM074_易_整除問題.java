package 數學II_MathematicsII;

import java.util.*;

public class C_MM074_易_整除問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		for (int num = 1; num < Math.pow(10, N); num++) {
			String tmp = String.format("%0" + N + "d", num);
			String reTmp = "";
			for (int index = tmp.length() - 1; index >= 0; index--) {
				reTmp += tmp.substring(index, index + 1);
			}
			if (String.valueOf(Integer.parseInt(reTmp)).length() == N)
				if (Integer.parseInt(reTmp) % N == 0)
					System.out.println(Integer.parseInt(reTmp));
		}
	}

}
