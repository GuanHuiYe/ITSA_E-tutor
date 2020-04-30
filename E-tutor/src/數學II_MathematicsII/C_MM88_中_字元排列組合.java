package 數學II_MathematicsII;

import java.util.*;

public class C_MM88_中_字元排列組合 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		perm(input.toCharArray(),0,input.length()-1);
	}

	public static void swap(char[] str, int a, int b) {
		char temp = str[a];
		str[a] = str[b];
		str[b] = temp;
	}

	public static void perm(char[] str, int from, int to) {
		if (from == to) {
			System.out.println(str);
			return;
		}
		for (int j = from; j <= to; j++) {
			swap(str, from, j);
			perm(str, from + 1, to);
			swap(str, from, j);
		}
	}

}
