package TH74;

import java.util.*;

public class Problem_2_®g­¸Ãð {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input = sc.nextLine().split(" ");
			double x = Double.parseDouble(input[0]);
			double y = Double.parseDouble(input[1]);
			double cm = Math.sqrt(Math.pow(x - 10, 2) + Math.pow(y - 10, 2));
			if (cm <= 1)
				System.out.println(10);
			else if (cm <= 2)
				System.out.println(9);
			else if (cm <= 3)
				System.out.println(8);
			else if (cm <= 4)
				System.out.println(7);
			else if (cm <= 5)
				System.out.println(6);
			else if (cm <= 6)
				System.out.println(5);
			else if (cm <= 7)
				System.out.println(4);
			else if (cm <= 8)
				System.out.println(3);
			else if (cm <= 9)
				System.out.println(2);
			else if (cm <= 10)
				System.out.println(1);
			else
				System.out.println(0);
		}

	}

}
