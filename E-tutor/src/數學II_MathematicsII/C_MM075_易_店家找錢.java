package 數學II_MathematicsII;

import java.util.*;

public class C_MM075_易_店家找錢 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int giftCount = Integer.parseInt(sc.nextLine());
		int giftMoney = Integer.parseInt(sc.nextLine());
		String[] input = sc.nextLine().split(" ");
		int m500 = Integer.parseInt(input[0]);
		int m100 = Integer.parseInt(input[1]);
		int m50 = Integer.parseInt(input[2]);
		int m10 = Integer.parseInt(input[3]);
		int m5 = Integer.parseInt(input[4]);
		int m1 = Integer.parseInt(input[5]);
		int sum = giftCount * giftMoney;
		while (sum > 1000) {
			sum -= 1000;
		} 
		if (sum == 1000)
			System.out.println(0);
		else {
			sum=1000-sum;
			int ans = 0;
			while (sum >= 500) {
				sum -= 500;
				m500--;
				ans++;
				if (m500 == 0)
					break;
			}
			while (sum >= 100) {
				sum -= 100;
				m100--;
				ans++;
				if (m100 == 0)
					break;
			}
			while (sum >= 50) {
				sum -= 50;
				m50--;
				ans++;
				if (m50 == 0)
					break;
			}
			while (sum >= 10) {
				sum -= 10;
				m10--;
				ans++;
				if (m10 == 0)
					break;
			}
			while (sum >= 5) {
				sum -= 5;
				m5--;
				ans++;
				if (m5 == 0)
					break;
			}
			while (sum >= 1) {
				sum -= 1;
				m1--;
				ans++;
				if (m1 == 0)
					break;
			}
			System.out.println(ans);
		}

	}

}
