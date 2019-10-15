package 資料結構_Datastructurec;

import java.util.*;

public class C_DT35_中_小稻米農場 {
	public static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int size_x = Integer.parseInt(input[0]);
		int size_y = Integer.parseInt(input[1]);
		map = new int[size_y][size_x];
		for (int y = 0; y < map.length; y++) {
			String[] input1 = sc.nextLine().split(" ");
			for (int x = 0; x < map[y].length; x++) {
				map[y][x] = Integer.parseInt(input1[x]);
			}
		}
		int ans1 = 0;
		int ans2 = 0;
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				if (map[y][x] != 0) {
					ans1++;
					int count = Get(y, x);
					if (ans2 < count)
						ans2 = count;
				}
			}
		}
		System.out.printf("%d\n%d\n", ans1, ans2);
	}

	public static int Get(int y, int x) {
		if (y < 0 || y >= map.length)
			return 0;
		if (x < 0 || x >= map[y].length)
			return 0;
		if (map[y][x] == 0)
			return 0;
		int count = map[y][x];
		map[y][x] = 0;
		count += Get(y + 1, x);
		count += Get(y, x + 1);
		count += Get(y - 1, x);
		count += Get(y, x - 1);
		return count;
	}

}
