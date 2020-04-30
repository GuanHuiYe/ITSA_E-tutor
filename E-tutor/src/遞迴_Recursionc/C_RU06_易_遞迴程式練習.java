package 遞迴_Recursionc;

import java.util.*;

public class C_RU06_易_遞迴程式練習 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(GetF(Integer.parseInt(sc.nextLine())));
	}

	public static long GetF(int num) {
		if (num == 0 || num == 1)
			return num + 1;
		else
			return GetF(num - 1) + GetF(num / 2);
	}

}
