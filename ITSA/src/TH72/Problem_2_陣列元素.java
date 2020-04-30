package TH72;

import java.util.*;

public class Problem_2_陣列元素 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			int[] sum = new int[20000];
			int maxNum = 0;
			for (String text : input) {
				int num = Integer.parseInt(text);
				sum[num]++;
				if (sum[num] > sum[maxNum]) {
					maxNum = num;
				}
			}
			if (sum[maxNum] > (input.length / 2))
				System.out.println(maxNum);
			else System.out.println("n/a");
		}
	}

}
