package »¼°j_Recursionc;

import java.util.*;

public class C_RU06_©ö_»¼°jµ{¦¡½m²ß {

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
