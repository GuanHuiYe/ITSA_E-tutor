package 綜合_Comprehensive;

import java.util.*;

public class C_CH25_中_黑暗角落 {
	public static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int[7][7];
		for (int y = 0; y < map.length; y++) {
			String[] input = sc.nextLine().split(" ");
			for (int x = 0; x < map[y].length; x++) {
				map[y][x] = Integer.parseInt(input[x]);
			}
		}
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				if (map[y][x] == 2) {
					light(x, y, 0, -1);
					light(x, y, 0, 1);
					light(x, y, -1, 0);
					light(x, y, 1, 0);
				}
			}
		}
		int count = 0;
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				if (map[y][x] == 0)
					count++;
			}
		}
		System.out.println(count);
	}

	public static void light(int x, int y, int xx, int yy) {
		if (y < 0 || y >= map.length)
			return;
		if (x < 0 || x >= map[y].length)
			return;
		if (map[y][x] == 1)
			return;
		map[y][x] = 3;
		light(x + xx, y + yy, xx, yy);
	}
}
