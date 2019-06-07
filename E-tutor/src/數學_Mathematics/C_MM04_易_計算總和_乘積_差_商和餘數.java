package 數學_Mathematics;

import java.util.Scanner;

public class C_MM04_易_計算總和_乘積_差_商和餘數 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(" ");
		int b = Integer.parseInt(a[0]), c = Integer.parseInt(a[1]);
		System.out.println(b + "+" + c + "=" + (b + c));
		System.out.println(b + "*" + c + "=" + (b * c));
		System.out.println(b + "-" + c + "=" + (b - c));
		System.out.print(b + "/" + c + "=" + (b / c) + "...");
		if (b % c >= 0) {			
			System.out.println(b % c);
		} else {
			int q = 0; 				
			while (true) {
				q++;
				if (((b / c)+q) == b) {				
					System.out.println(q);
					break;
				}
			}
		}

	}

}
