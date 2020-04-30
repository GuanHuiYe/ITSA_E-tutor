package 字串_Stringsc;

import java.util.*;

public class C_ST26_易_信用卡卡號檢查 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if (input.length() != 16)
			System.out.println("Error");
		else {
			int sum = 0;
			for (int index = 0; index < input.length(); index++) {
				int num = Integer.parseInt(input.substring(index, index + 1));
				num *= (index+1) % 2 == 0 ? 2 : 1;
				if (num / 10 > 0)
					num = (num / 10) + (num % 10);
				sum += num;
			}
			System.out.println(sum%10==0?"Y":"N");
		}

	}

}
