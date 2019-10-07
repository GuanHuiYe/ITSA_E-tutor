package 字串_Stringsc;

import java.util.*;

public class C_ST10_易_星號直角三角形輸出 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = Integer.parseInt(sc.nextLine());
		for (int n = 1; n <= height; n++) {
			for (int space = height - n; space > 0; space--) {
				System.out.print(" ");
			}
			for (int item = 0; item < n; item++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
