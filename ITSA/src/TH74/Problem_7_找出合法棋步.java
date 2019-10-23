package TH74;

import java.util.*;

public class Problem_7_找出合法棋步 {
	public static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int[8][8];
		for (int y = 0; y < map.length; y++) {
			String[] input = sc.nextLine().split(" ");
			for (int x = 0; x < map[y].length; x++) {
				map[y][x] = Integer.parseInt(input[x]);
			}
		}
		int ans = 0;
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				if (map[y][x] == 0) {

					boolean test = false;
					if (!test)
						test = go(x, y, -1, 0, false);
					if (!test)
						test = go(x, y, -1, -1, false);
					if (!test)
						test = go(x, y, 0, -1, false);
					if (!test)
						test = go(x, y, 1, -1, false);
					if (!test)
						test = go(x, y, 1, 0, false);
					if (!test)
						test = go(x, y, 1, 1, false);
					if (!test)
						test = go(x, y, 0, 1, false);
					if (!test)
						test = go(x, y, -1, 1, false);
					if (test)
						ans++;

				}

			}
		}
		System.out.println(ans);
	}

	public static boolean go(int x, int y, int shift_x, int shift_y, boolean test) {
		if (y + shift_y < 0 || y + shift_y >= map.length)
			return false;
		if (x + shift_x < 0 || x + shift_x >= map[y].length)
			return false;
		if (map[y + shift_y][x + shift_x] == 0)
			return false;
		if (test && map[y + shift_y][x + shift_x] == 1)
			return true;
		if (!test && map[y + shift_y][x + shift_x] == 1)
			return false;
		test = true;
		return go(x + shift_x, y + shift_y, shift_x, shift_y, test);
	}

}
