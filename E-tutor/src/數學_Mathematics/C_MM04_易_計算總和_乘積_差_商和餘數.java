package �ƾ�_Mathematics;

import java.util.Scanner;

public class C_MM04_��_�p���`�M_���n_�t_�өM�l�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(" ");
		int b = Integer.parseInt(a[0]), c = Integer.parseInt(a[1]);
		System.out.println(b + "+" + c + "=" + (b + c));
		System.out.println(b + "*" + c + "=" + (b * c));
		System.out.println(b + "-" + c + "=" + (b - c));

		if (b % c >= 0) {
			System.out.print(b + "/" + c + "=" + (b / c) + "...");
			System.out.println(b % c);
		} else {
			int q = 1; 				
			while (true) {
				q++;
				if ((b - (q * c)) >= 0) {
					System.out.print(b + "/" + c + "=" + q + "...");
					System.out.println(b - (q * c));
					break;
				}
			}
		}

	}

}
