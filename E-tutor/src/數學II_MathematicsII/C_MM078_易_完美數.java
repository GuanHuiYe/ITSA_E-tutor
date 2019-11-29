package 數學II_MathematicsII;

import java.util.*;

public class C_MM078_易_完美數 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		String ans = "";
		for (int num = Integer.parseInt(input[0]); num <= Integer.parseInt(input[1]); num++) {
			if (num == 0)
				continue;
			int sum = 0;
			for (int n = 1; n < num; n++) {
				if (num % n == 0)
					sum += n;
			}
			if (sum == num)
				ans += num + " ";
		}
		if (ans.length() > 0)
			System.out.println(ans.substring(0, ans.length() - 1));
		else
			System.out.println("null");

	}

}
