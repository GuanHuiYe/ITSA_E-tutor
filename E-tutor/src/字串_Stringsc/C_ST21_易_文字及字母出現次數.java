package 字串_Stringsc;

import java.util.*;

public class C_ST21_易_文字及字母出現次數 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] count = new int[27];
		int[] count1 = new int[27];
		for (String str_item : input) {
			char[] charArr = str_item.toCharArray();
			for (char item : charArr) {
				if (item < 'a')
					count1[item - 65] += 1;
				else
					count[item - 97] += 1;

			}
		}
		System.out.println(input.length);
		for (int index = 0; index < count.length; index++) {
			if (count[index] > 0)
				System.out.println((char) (index + 97) + " : " + count[index]);

			if (count1[index] > 0)
				System.out.println((char) (index + 65) + " : " + count1[index]);
		}

	}

}
