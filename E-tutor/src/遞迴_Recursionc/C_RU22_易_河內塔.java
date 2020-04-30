package 遞迴_Recursionc;

import java.util.*;

public class C_RU22_易_河內塔 {
	public static String ans;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		ans = "";
		hanoi(size, size);
		System.out.print(ans);
	}

	public static void hanoi(int n, int disk) {
		if (n == 1) {
			ans += disk + "\n";
		} else {
			hanoi(n - 1, disk - 1);
			hanoi(1, disk);
			hanoi(n - 1, disk - 1);
		}
	}
}
