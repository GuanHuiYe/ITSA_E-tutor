package TH73;

import java.util.*;

public class Problem_2_複數的加減乘法 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input1 = sc.nextLine().split(" ");
		String[] input2 = sc.nextLine().split(" ");
		double a = Double.parseDouble(input1[0]), b = Double.parseDouble(input1[1]), c = Double.parseDouble(input2[0]),
				d = Double.parseDouble(input2[1]);
		System.out.printf("(%.2f)+(%.2f)i\n", a + c, b + d);
		System.out.printf("(%.2f)+(%.2f)i\n", a - c, b - d);
		System.out.printf("(%.2f)+(%.2f)i\n", (a * c) - (b * d), (b * c) + (a * d));
	}

}
