package 字串_Stringsc;

import java.util.*;

public class C_ST12_易_星號依規則輸出 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int Start = Integer.parseInt(input[0]);
		int End = Integer.parseInt(input[1]);
		if (Start > End) {
			for (int start = Integer.parseInt(input[0]); start >= Integer.parseInt(input[1]); start--) {
				for (int n = start; n > 0; n--) {
					System.out.print("*");
				}
				System.out.println();
			}

		} else {
			for (int start = Integer.parseInt(input[0]); start <= Integer.parseInt(input[1]); start++) {
				for (int n = start; n > 0; n--) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}

}
