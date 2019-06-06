package TH62;

import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			int[][] map = new int[3][3];
			String[] l1 = sc.nextLine().split(" ");
			String[] l2 = sc.nextLine().split(" ");
			String[] l3 = sc.nextLine().split(" ");
			for (int n = 0; n < 3; n++) {
				map[0][n] = Integer.parseInt(l1[n]);
				map[1][n] = Integer.parseInt(l2[n]);
				map[2][n] = Integer.parseInt(l3[n]);
			}
			if (map[0][0] == map[0][1] && map[0][1] == map[0][2]) {
				System.out.println("True");
			} else if (map[1][0] == map[1][1] && map[1][1] == map[1][2]) {
				System.out.println("True");
			} else if (map[2][0] == map[2][1] && map[2][1] == map[2][2]) {
				System.out.println("True");
			} else if (map[0][0] == map[1][0] && map[1][0] == map[2][0]) {
				System.out.println("True");
			} else if (map[0][1] == map[1][1] && map[1][1] == map[2][1]) {
				System.out.println("True");
			} else if (map[0][2] == map[1][2] && map[1][2] == map[2][2]) {
				System.out.println("True");
			} else if (map[0][0] == map[1][1] && map[1][1] == map[2][2]) {
				System.out.println("True");
			} else if (map[0][2] == map[1][1] && map[1][1] == map[2][0]) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
	}

}
