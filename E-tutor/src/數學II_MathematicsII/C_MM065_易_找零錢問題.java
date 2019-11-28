package 數學II_MathematicsII;

import java.util.*;

public class C_MM065_易_找零錢問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");
		int money = Integer.parseInt(input[0]), apple = Integer.parseInt(input[1]), orange = Integer.parseInt(input[2]),
				peach = Integer.parseInt(input[3]);
		int sum = apple * 15 + orange * 20 + peach * 30;
		if (money < sum)
			System.out.println(0);
		else {
			money-=sum;
			int m1 = 0, m5 = 0, m50 = 0;
			m50 = money / 50;
			money %= 50;
			m5 = money / 5;
			money %= 5;
			m1 = money;
			System.out.println(m1 + "," + m5 + "," + m50);
		}
	}

}
