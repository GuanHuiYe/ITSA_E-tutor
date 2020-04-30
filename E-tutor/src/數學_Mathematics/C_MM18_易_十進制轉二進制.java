package 數學_Mathematics;

import java.util.Scanner;

public class C_MM18_易_十進制轉二進制 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double in = sc.nextDouble();
		String ans = Integer.toBinaryString((int) in);
		if (in >= 0) {
			while (ans.length() < 8) {
				ans = "0" + ans;
			}
		} else {
			ans=ans.substring(ans.length()-8);
		}
		System.out.println(ans);
	}

}
