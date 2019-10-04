package 陣列_Array;

import java.util.*;

public class C_AR38_易_反轉表 {
	public static int[] rule;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rule = new int[Integer.parseInt(sc.nextLine())];

		String[] input = sc.nextLine().split(" ");
		for (int index = 0; index < rule.length; index++) {
			rule[index] = Integer.parseInt(input[index]);
		}

		ans(new int[rule.length], 0);
	}

	public static Boolean ans(int[] ans_arr, int index) {
		if (index == ans_arr.length) {
			Boolean test = true;
			for (int Index = 0; Index < ans_arr.length; Index++) {
				int count = 0;
				for (int n = 0; n < Index; n++) {
					if (ans_arr[n] > ans_arr[Index])
						count++;
				}
				if(count!=rule[ans_arr[Index]-1]) {
					test=false;
					break;
				}
			}
			if (test) {
				for (int Index = 0; Index < ans_arr.length; Index++) {
					System.out.print(ans_arr[Index] + (Index == ans_arr.length - 1 ? "\n" : " "));
				}
			}
			return test;
		}
		for (int n = 1; n <= ans_arr.length; n++) {
			Boolean test = true;
			for (int Index = 0; Index < ans_arr.length; Index++) {
				if (n == ans_arr[Index]) {
					test = false;
					break;
				}
			}
			if (test) {
				ans_arr[index] = n;
				if( ans(ans_arr, index + 1))return true;
			}
			ans_arr[index] = 0;

		}
		return false;

	}

}
