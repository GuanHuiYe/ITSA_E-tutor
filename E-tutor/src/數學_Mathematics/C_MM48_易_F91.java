package ¼Æ¾Ç_Mathematics;

import java.util.*;

public class C_MM48_©ö_F91 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] input = sc.nextLine().split(" ");
		for (String item : input) {
			System.out.println(getF91(Integer.parseInt(item)));
		}
	}

	public static int getF91(int n) {
		if (n <= 100) {
			return getF91(getF91(n + 11));
		} else {
			return n - 10;
		}
	}

}
