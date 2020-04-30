package 陣列II_ArrayII;

import java.util.*;

public class C_AR56_中_字串拼圖 {

	public static String Search;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		char[][] map = new char[Integer.parseInt(input[0])][Integer.parseInt(input[0])];
		for (int y = 0; y < map.length; y++) {
			char[] in = sc.nextLine().toCharArray();
			for (int x = 0; x < map[y].length; x++) {
				map[y][x] = in[x];
			}
		}
		for (int nth = Integer.parseInt(input[1]); nth > 0; nth--) {
			Search = sc.nextLine();
			Boolean test = false;
			for (int y = 0; y < map.length; y++) {
				for (int x = 0; x < map[y].length; x++) {

					if (search(x, y, clone(map), "")) {
						test = true;
						break;
					}
				}
				if (test)
					break;
			}
			System.out.println(test ? "Yes" : "No");
		}

	}

	public static Boolean search(int x, int y, char[][] map, String aims) {

		if (x < 0 || y < 0)
			return false;
		if (y >= map.length)
			return false;
		if (x >= map[y].length)
			return false;
		if (map[y][x] == '0')
			return false;
		aims += map[y][x];
		map[y][x] = '0';
		if (aims.length() == Search.length()) {
			if (Search.equals(aims))
				return true;
			return false;
		}

		if (search(x - 1, y, clone(map), aims))
			return true;
		if (search(x, y - 1, clone(map), aims))
			return true;
		if (search(x + 1, y, clone(map), aims))
			return true;
		if (search(x, y + 1, clone(map), aims))
			return true;

		return false;

	}

	public static char[][] clone(char[][] map) {
		char[][] result = new char[map.length][];
		for (int y = 0; y < map.length; y++) {
			result[y] = new char[map[y].length];
			for (int x = 0; x < map[y].length; x++) {
				result[y][x] = map[y][x];
			}
		}
		return result;
	}
}
