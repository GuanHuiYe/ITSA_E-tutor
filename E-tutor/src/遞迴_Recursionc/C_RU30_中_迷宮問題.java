package »¼°j_Recursionc;

import java.util.*;

public class C_RU30_¤¤_°g®c°ÝÃD {
	public static String[][] map;
	public static int Start_X = 8;
	public static int Start_Y = 8;
	public static int End_X = 1;
	public static int End_Y = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new String[10][10];
		for (int y = 0; y < map.length; y++) {
			String[] input = sc.nextLine().split(" ");
			for (int x = 0; x < map[y].length; x++) {
				map[y][x] = input[x];
			}
		}
		Boolean test = false;
		map[Start_Y][Start_X] = "S";
		map[End_Y][End_X] = "X";
		if (!test)
			test = GO(Start_X + 1, Start_Y);
		if (!test)
			test = GO(Start_X, Start_Y - 1);
		if (!test)
			test = GO(Start_X - 1, Start_Y);
		if (!test)
			test = GO(Start_X, Start_Y + 1);
		System.out.println(test ? "YES" : "NO");
		print();
	}

	public static Boolean GO(int x, int y) {
		if (x == End_X && y == End_Y)
			return true;

		if (map[y][x].equals("1") || map[y][x].equals("S") || map[y][x].equals("G"))
			return false;
		map[y][x] = "G";

		if (GO(x + 1, y))
			return true;
		if (GO(x, y - 1))
			return true;
		if (GO(x - 1, y))
			return true;
		if (GO(x, y + 1))
			return true;

		map[y][x] = "D";
		return false;
	}

	public static void print() {
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				System.out.print(map[y][x] + (x == map[y].length - 1 ? "\n" : " "));
			}
		}
	}
}
