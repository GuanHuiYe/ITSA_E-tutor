package 數學_Mathematics;

import java.util.*;

public class C_MM37_易_判斷座標位於何處 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		if (x == 0) {
			if (y == 0)
				System.out.println("Origin");
			else
				System.out.println("y-axis");
		} else if (y == 0)
			System.out.println("x-axis");
		else if (x > 0) {
			if (y > 0)
				System.out.println("1st Quadrant");
			else
				System.out.println("4th Quadrant");
		} else {
			if (y > 0)
				System.out.println("2nd Quadrant");
			else
				System.out.println("3rd Quadrant");
		}

	}

}
