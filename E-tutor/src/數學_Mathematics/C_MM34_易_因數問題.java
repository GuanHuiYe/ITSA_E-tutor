package 數學_Mathematics;

import java.util.*;

public class C_MM34_易_因數問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = Integer.parseInt(sc.nextLine());
			String ans = "";
			for (int n = 1; n <= num; n++) {
				if (num % n == 0)
					ans += n + " ";
			}
			System.out.println(ans.substring(0, ans.length() - 1));

		}
	}

}
